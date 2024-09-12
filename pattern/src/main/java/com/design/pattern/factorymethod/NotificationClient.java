package com.design.pattern.factorymethod;

public class NotificationClient {
    public static void main(String[] args) {
        Notification notificationFactory = new EmailNotificationFactory().createNotification();
        notificationFactory.notifyUser();
        notificationFactory = new SMSNotificationFactory().createNotification();
        notificationFactory.notifyUser();
    }
}
