import java.util.Scanner;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        CurrencyService service = new CurrencyService();
        CurrencyConverterUI ui = new CurrencyConverterUI(service);
        ui.start();
    }
}


