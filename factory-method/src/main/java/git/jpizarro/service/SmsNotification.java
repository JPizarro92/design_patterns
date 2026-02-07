package git.jpizarro.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SmsNotification implements Notification{
    @Override
    public String send(String message) {
        return "Envío de sms: " + message;
    }
}
