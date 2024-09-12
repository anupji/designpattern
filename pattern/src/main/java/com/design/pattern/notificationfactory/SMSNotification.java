package com.design.pattern.notificationfactory;

public class SMSNotification extends Notification{
    @Override
    public void sendNotification() {
        System.out.println("Sending SMS notification");
    }
}
