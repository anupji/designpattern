package com.design.pattern.javadp;

import java.util.Scanner;

//The pattern delegates state-specific behavior to different state classes.
class StatePatternDemo {
        public static void main(String[] args) {
            TrafficLight trafficLight = new TrafficLight();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Traffic Light System (Type 'next' to change light or 'exit' to quit)");

            while (true) {
                System.out.println("Current Light: " + trafficLight.getCurrentState());
                System.out.print("Enter command: ");

                String command = scanner.nextLine();

                if (command.equalsIgnoreCase("next")) {
                    trafficLight.changeState();
                } else if (command.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting Traffic Light System...");
                    break;
                } else {
                    System.out.println("Invalid command! Type 'next' or 'exit'.");
                }
            }

            scanner.close();
        }
}

interface TrafficLightState {
    void changeState(TrafficLight trafficLight);
}

class TrafficLight {
    private TrafficLightState state;

    public TrafficLight() {
        state = new RedLight();
    }

    public void setState(TrafficLightState trafficLightState) {
        this.state = trafficLightState;
    }

    public void changeState() {
        state.changeState(this);
    }

    public String getCurrentState() {
        return state.getClass().getSimpleName();
    }
}
class GreenLight implements TrafficLightState {
    @Override
    public void changeState(TrafficLight trafficLight) {
        System.out.println("green light");
        trafficLight.setState(new YellowLight());
    }
}

class YellowLight implements TrafficLightState {
    @Override
    public void changeState(TrafficLight trafficLight) {
        System.out.println("yellow light");
        trafficLight.setState(new RedLight());
    }
}

class RedLight implements TrafficLightState {
    @Override
    public void changeState(TrafficLight trafficLight) {
        System.out.println("red light");
        trafficLight.setState(new GreenLight());
    }
}