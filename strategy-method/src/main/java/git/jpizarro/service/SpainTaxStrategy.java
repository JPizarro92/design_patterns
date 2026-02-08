package git.jpizarro.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SpainTaxStrategy implements TaxStrategy{
    @Override
    public double applyTax(double amount) {
        return amount * 1.21;
    }

    @Override
    public String getCountryCode() {
        return "ES";
    }
}
