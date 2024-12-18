public class CurrencyRate {
    private String CurrencyName;
    private double ExchangeRate;
    public CurrencyRate(String CurrencyName, double ExchangeRate) {
        this.CurrencyName = CurrencyName;
        this.ExchangeRate = ExchangeRate;
    }
    public String getCurrencyName() {
        return CurrencyName;
    }
    public void setCurrencyName(String CurrencyName) {
        this.CurrencyName = CurrencyName;
    }
    public double getExchangeRate() {
        return ExchangeRate;
    }
    public void setExchangeRate(double ExchangeRate) {
        this.ExchangeRate = ExchangeRate;
    }
}
