package git.jpizarro.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EmailNotification implements Notification{
    @Override
    public String send(String message) {
        return "Envío de email: " + message;
    }
}
