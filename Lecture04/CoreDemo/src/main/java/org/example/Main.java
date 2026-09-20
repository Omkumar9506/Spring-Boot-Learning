package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;
import org.example.notification.PopUpNotification;
import org.example.notification.SmsNotification;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        NotificationService notification = new PopUpNotification();
        OrderService order = new OrderService(notification);
        order.placeOrder();
    }
}
