package com.design.pattern.javadp;

import java.util.ArrayList;
import java.util.List;

class ObserverDemo {
    public static void main(String[] args) {
        ObserverA observerA = new MobileDisplay();
        ObserverA observerB = new ScreenDisplay();
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.registerObserver(observerA);
        weatherStation.registerObserver(observerB);
        //weatherStation.notifyObservers();
        weatherStation.setTemperature(30.2);
        weatherStation.setTemperature(35.2);
    }
}
interface ObserverA {
    void update(double temperature);
}

class MobileDisplay implements ObserverA {

    @Override
    public void update(double temperature) {
        System.out.println("Mobile App: Temperature updated to " + temperature + " degrees.");
    }
}

class ScreenDisplay implements ObserverA {

    @Override
    public void update(double temperature) {
        System.out.println("Screen App: Temperature updated to " + temperature + " degrees.");
    }
}

interface Subject {
    void registerObserver(ObserverA observer);
    void removeObserver(ObserverA observer);
    void notifyObservers();
}
class WeatherStation implements Subject {
    private List<ObserverA> observers = new ArrayList<>();
    private double temperature;

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
    @Override
    public void registerObserver(ObserverA observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ObserverA observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ObserverA observer : observers) {
            observer.update(temperature);
        }
    }
}