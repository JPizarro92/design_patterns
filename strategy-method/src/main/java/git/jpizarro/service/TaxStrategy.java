package git.jpizarro.service;

public interface TaxStrategy {
    double applyTax(double amount);
    String getCountryCode();
}
