package Lesson7.Exercise6;

public interface CurrencyRateProvider {

  double getBuyRate(Currency currency);

  double getSellRate(Currency currency);
}
