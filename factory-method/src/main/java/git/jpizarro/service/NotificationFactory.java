package git.jpizarro.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificationFactory {

    public Notification createNotification(String type){
        return switch (type) {
            case "email" -> new EmailNotification();
            case "sms" -> new SmsNotification();
            default -> throw new IllegalArgumentException("Tipo de notificación desconocida.");
        };
    }

}
