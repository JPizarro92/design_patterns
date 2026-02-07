package git.jpizarro.resource;

import git.jpizarro.service.NotificationFactory;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("")
public class NotificationResource {

    @Inject
    NotificationFactory notificationFactory;

    @GET
    @Path("/{type}")
    @Produces(MediaType.TEXT_PLAIN)
    public String sendNotification(@PathParam("type") String type, @QueryParam("msg") String msg){
        return notificationFactory.createNotification(type).send(msg);
    }

}
