package git.jpizarro.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped
public class TaxContext {

    @Inject
    Instance<TaxStrategy> strategies;

    public double calculateTax(double amount, String countryCode){
        return strategies.stream().filter(
                s -> s.getCountryCode().equalsIgnoreCase(countryCode))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No hay estrategia para: " + countryCode))
                .applyTax(amount);
    }

}
