package git.jpizarro.resource;

import git.jpizarro.counter.GlobalCounter;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/counter")
public class CounterResource {

    @Inject
    GlobalCounter counter;

    @GET
    public String getCount(){
        return "Contador Global: " + counter.increment();
    }

}
