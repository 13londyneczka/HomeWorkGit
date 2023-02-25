package Lesson7.Exercise6;

public class CurrencyCalculator {

  private final CurrencyRateProvider currencyRateProvider;

  public CurrencyCalculator(CurrencyRateProvider currencyRateProvider) {
    this.currencyRateProvider = currencyRateProvider;
  }

  public double convertPlnToCurrency(Currency currency, double amount) {
    double sellRate = currencyRateProvider.getSellRate(currency);
    return amount * sellRate;
  }

  public double convertCurrencyToPln(Currency currency, double amount) {
    double buyRate = currencyRateProvider.getBuyRate(currency);
    return amount * buyRate;
  }
}
