package com.design.pattern.factorymethod;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending SMS notification to user");
    }
}
