package MVVM;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class CurrencyViewModel {
    private List<CurrencyRate> currencies;
    public CurrencyViewModel() {
        currencies = new ArrayList<CurrencyRate>();
    }
    public void addCurrency(String name, double rate) {
        CurrencyRate c = new CurrencyRate(name, rate);
        currencies.add(c);
    }
    public void changeRate(String name, double rate) {
        for (CurrencyRate c : currencies) {
            if (c.getCurrencyName().equals(name)) {
                c.setCurrencyRate(rate);
            }
        }
    }
    public List<CurrencyRate> getCurrencies() {
        return currencies;
    }
}
