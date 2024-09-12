package com.design.pattern.notificationfactory;

public class EmailNotification extends Notification{
    @Override
    public void sendNotification() {
        System.out.println("Sending an email notification");
    }
}
