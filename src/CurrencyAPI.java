public class CurrencyAPI {
    public static double convert(ExchangeResponse data, String target, double amount) {
        if (data.getConversion_rates().containsKey(target)) {
            double rate = data.getConversion_rates().get(target);
            return amount * rate;
        } else {
            throw new IllegalArgumentException("Moneda no encontrada: " + target);
        }
    }
}
