package com.design.pattern.factorymethod;

public abstract class NotificationFactory {
    abstract Notification createNotification();

    public void notifyUser(){
        Notification notification = createNotification();
        notification.notifyUser();
    }
}
