package git.jpizarro.listener;

import git.jpizarro.model.Order;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ApplicationScoped
public class InventoryListener {
    void updateStock(@Observes Order order) {
        log.info("[INVENTARIO] Reduciendo stock de: {}", order.product());
    }
}
