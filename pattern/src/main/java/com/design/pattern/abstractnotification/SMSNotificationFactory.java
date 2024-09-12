package com.design.pattern.abstractnotification;

public class SMSNotificationFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
