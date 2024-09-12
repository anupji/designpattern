package com.design.pattern.factorymethod;

public class SMSNotificationFactory extends NotificationFactory{
    @Override
    Notification createNotification() {
        return new SMSNotification();
    }
}
