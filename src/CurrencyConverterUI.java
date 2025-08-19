import java.util.Map;
import java.util.Scanner;

public class CurrencyConverterUI {

    private final CurrencyService service;

    public CurrencyConverterUI(CurrencyService service) {
        this.service = service;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese la moneda base (ejemplo: USD): ");
            String baseCurrency = scanner.nextLine().toUpperCase();

            Currency rates = service.getExchangeRates(baseCurrency);
            Map<String, Double> filtered = CurrencyFilter.filterCurrencies(rates, "USD", "EUR", "MXN", "DOP", "BRL");

            System.out.println("\n=== Tasas filtradas ===");
            filtered.forEach((currency, value) ->
                    System.out.println(currency + " : " + value));

            System.out.print("\nIngrese la moneda de origen: ");
            String fromCurrency = scanner.nextLine().toUpperCase();
            System.out.print("Ingrese la moneda de destino: ");
            String toCurrency = scanner.nextLine().toUpperCase();
            System.out.print("Ingrese la cantidad: ");
            double amount = scanner.nextDouble();

            double result = service.convertCurrency(fromCurrency, toCurrency, amount);
            System.out.printf("\n%.2f %s = %.2f %s%n", amount, fromCurrency, result, toCurrency);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
