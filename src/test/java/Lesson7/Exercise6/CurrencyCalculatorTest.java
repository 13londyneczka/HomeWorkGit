package Lesson7.Exercise6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CurrencyCalculatorTest {

  @Test
  void shouldConvertPlnToCurrency() {
    //given

    CurrencyRateProvider currencyRateProviderMock = Mockito.mock(CurrencyRateProvider.class);
    Mockito.when(currencyRateProviderMock.getSellRate(Currency.EUR)).thenReturn(0.25);
    CurrencyCalculator currencyCalculator = new CurrencyCalculator(currencyRateProviderMock);

    //when
    double result = currencyCalculator.convertPlnToCurrency(Currency.EUR, 1000);

    //then
    Assertions.assertEquals(250, result);
  }

  @Test
  void shouldConvertCurrencyToPln() {
    //given
    CurrencyRateProvider currencyRateProviderMock = Mockito.mock(CurrencyRateProvider.class);
    Mockito.when(currencyRateProviderMock.getBuyRate(Currency.EUR)).thenReturn(4.0);
    CurrencyCalculator currencyCalculator = new CurrencyCalculator(currencyRateProviderMock);

    //when
    double result = currencyCalculator.convertCurrencyToPln(Currency.EUR, 1000);

    //then
    Assertions.assertEquals(4000, result);
  }
}