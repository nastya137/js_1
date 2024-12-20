package MVVM;

public class CurrencyRate {
    private String currencyName;
    private double currencyRate;
    public CurrencyRate(String currencyName, double currencyRate) {
        this.currencyName = currencyName;
        this.currencyRate = currencyRate;
    }
    public String getCurrencyName() {
        return currencyName;
    }
    public double getCurrencyRate() {
        return currencyRate;
    }
    public void setCurrencyRate(double currencyRate) {
        this.currencyRate = currencyRate;
    }
}
