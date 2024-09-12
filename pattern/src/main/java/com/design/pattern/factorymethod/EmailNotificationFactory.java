package com.design.pattern.factorymethod;

public class EmailNotificationFactory extends NotificationFactory{
    @Override
    Notification createNotification() {
        return new EmailNotification();
    }
}
