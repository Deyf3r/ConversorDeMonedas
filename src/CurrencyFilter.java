import java.util.HashMap;
import java.util.Map;

public class CurrencyFilter {

    public static Map<String, Double> filterCurrencies(Currency currencyData, String... targetCurrencies) {
        Map<String, Double> filtered = new HashMap<>();
        for (String target : targetCurrencies) {
            if (currencyData.getRates().containsKey(target)) {
                filtered.put(target, currencyData.getRates().get(target));
            }
        }
        return filtered;
    }
}
