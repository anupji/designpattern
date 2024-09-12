package com.design.pattern.notificationfactory;

public class NotificationClient {
    public static void main(String[] args) {
        Notification notification = new NotificationFactory().sendNotification(Medium.EMAIL);
        notification.sendNotification();
        notification = new NotificationFactory().sendNotification(Medium.SMS);
        notification.sendNotification();
    }
}
