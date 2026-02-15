package git.jpizarro.listener;

import git.jpizarro.model.Order;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ApplicationScoped
public class EmailListener {
    void sendConfirmation(@Observes Order order) {
        log.info("[EMAIL] Enviando confirmación para el pedido # {}", order.id());
    }
}
