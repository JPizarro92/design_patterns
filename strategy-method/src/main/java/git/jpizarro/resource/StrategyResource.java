package git.jpizarro.resource;

import git.jpizarro.service.TaxContext;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;

@Path("/")
public class StrategyResource {

    @Inject
    TaxContext taxContext;

    @GET
    @Path("/{country}")
    public String checkout(@PathParam("country") String country, @QueryParam("total") double total) {
        double finalPrice = taxContext.calculateTax(total, country);
        return "El precio final en " + country + " es: " + finalPrice;
    }

}
