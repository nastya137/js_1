package MVVM;

import java.util.Currency;
import java.util.List;

public class CurrencyView {
    public void output(List<CurrencyRate> currencies) {
        for (CurrencyRate currencyRate : currencies) {
            System.out.println(currencyRate.getCurrencyName()+" "+currencyRate.getCurrencyRate());
        }
    }
}
