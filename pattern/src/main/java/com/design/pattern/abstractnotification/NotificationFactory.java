package com.design.pattern.abstractnotification;

public abstract class NotificationFactory {

    public abstract Notification createNotification();

    //public NotificationFactory(){}
    /*Notification sendNotification(Medium medium){
        switch (medium){
            case SMS: return new SMSNotification();
            case EMAIL: return new EmailNotification();
            default: return null;
        }
    }*/
}
