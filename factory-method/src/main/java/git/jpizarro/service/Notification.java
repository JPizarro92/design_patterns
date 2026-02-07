package git.jpizarro.service;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.core.Response;

public interface Notification {
    String send(String message);
}
