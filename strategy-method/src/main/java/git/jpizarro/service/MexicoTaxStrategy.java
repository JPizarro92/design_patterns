package git.jpizarro.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MexicoTaxStrategy implements TaxStrategy{
    @Override
    public double applyTax(double amount) {
        return amount * 1.16;
    }

    @Override
    public String getCountryCode() {
        return "MX";
    }
}
