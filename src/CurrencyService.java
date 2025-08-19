import com.google.gson.Gson;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class CurrencyService {
    private static final String API_KEY = "";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    // Obtener todas las tasas desde la moneda base
    public Currency getExchangeRates(String baseCurrency) throws Exception {
        URL url = new URL(API_URL + baseCurrency);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        try (InputStreamReader reader = new InputStreamReader(connection.getInputStream())) {
            Currency response = new Gson().fromJson(reader, Currency.class);

            if (response == null || response.getRates() == null) {
                throw new RuntimeException("No se pudieron obtener las tasas de cambio de la API.");
            }

            return response;
        }
    }

    // Conversión de moneda
    public double convertCurrency(String fromCurrency, String toCurrency, double amount) throws Exception {
        Currency data = getExchangeRates(fromCurrency);

        Map<String, Double> rates = data.getRates();
        Double rate = rates.get(toCurrency);

        if (rate == null) {
            throw new IllegalArgumentException("Moneda de destino no soportada: " + toCurrency);
        }

        return amount * rate;
    }
}