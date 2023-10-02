package practice3;

public class CurrencyConverter {
    String givenCurrency; // заданная валюта
    String finalCurrency; // конечная валюта
    double exchangeRate; // курс обмена

    public CurrencyConverter(String givenCurrency, String finalCurrency, double exchangeRate) {
        this.givenCurrency = givenCurrency;
        this.finalCurrency = finalCurrency;
        this.exchangeRate = exchangeRate;
    }

    public double convert(double amount) {
        return amount * exchangeRate;
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter("USD", "EUR", 0.85);
        double amount = 10.00;
        double convertedAmount = converter.convert(amount);
        System.out.printf("%.2f %s = %.2f %s", amount, converter.givenCurrency, convertedAmount, converter.finalCurrency);
    }

}
