package org.example.notification;

public class PopUpNotification implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Pop Up notification send");
    }
}
