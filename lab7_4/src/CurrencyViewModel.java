import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class CurrencyViewModel {
    private List<CurrencyRate> currencies;

    public CurrencyViewModel() {
        currencies = new ArrayList<>();
    }

    public List<CurrencyRate> getCurrencies() {
        return currencies;
    }
    public void addCurrency(CurrencyRate currency) {
        currencies.add(currency);
    }
    public void changeRate(CurrencyRate currency, double rate) {
        int index = currencies.indexOf(currency);
        currencies.get(index).setExchangeRate(rate);
    }
}
