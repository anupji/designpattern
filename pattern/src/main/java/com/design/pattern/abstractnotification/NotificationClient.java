package com.design.pattern.abstractnotification;

public class NotificationClient {
    public static void main(String[] args) {
        Notification notification = new SMSNotificationFactory().createNotification();
        notification.sendNotification();

        notification = new EmailNotificationFactory().createNotification();
        notification.sendNotification();

    }
}
