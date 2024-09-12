package com.design.pattern.abstractnotification;

public class EmailNotificationFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
