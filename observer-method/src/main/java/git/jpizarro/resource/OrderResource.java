package git.jpizarro.resource;

import git.jpizarro.model.Order;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/orders")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class OrderResource {

    @Inject
    Event<Order> orderEvent;

    @POST
    public Response createOrder(Order order) {
        // fireAsync devuelve un CompletionStage y no bloquea el hilo principal
        orderEvent.fire(order);
        return Response.accepted(order).build();
    }

}
