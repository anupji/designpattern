package com.design.pattern.notificationfactory;

public class NotificationFactory {

    //public NotificationFactory(){}
    Notification sendNotification(Medium medium){
        switch (medium){
            case SMS: return new SMSNotification();
            case EMAIL: return new EmailNotification();
            default: return null;
        }
    }
}
