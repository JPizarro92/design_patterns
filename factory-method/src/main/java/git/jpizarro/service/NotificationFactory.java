package git.jpizarro.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class NotificationFactory {

    EmailNotification emailNotification;
    SmsNotification smsNotification;

    @Inject
    NotificationFactory(EmailNotification emailNotification,SmsNotification smsNotification){
        this.emailNotification = emailNotification;
        this.smsNotification = smsNotification;
    }

    public Notification createNotification(String type){
        return switch (type) {
            case "email" -> emailNotification;
            case "sms" -> smsNotification;
            default -> throw new IllegalArgumentException("Tipo de notificación desconocida.");
        };
    }

}
