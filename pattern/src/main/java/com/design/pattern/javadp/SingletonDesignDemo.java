package com.design.pattern.javadp;

public class SingletonDesignDemo {
    private static SingletonDesignDemo instance;
    private SingletonDesignDemo() {}
    public static synchronized SingletonDesignDemo getInstance() {
        if (instance == null) {
            instance = new SingletonDesignDemo();
        }
        return instance;
    }

    public void show() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        SingletonDesignDemo demo = SingletonDesignDemo.getInstance();
        SingletonDesignDemo demo2 = SingletonDesignDemo.getInstance();
        System.out.println(demo == demo2);
        System.out.println(demo+", "+demo2);
        demo.show();
        demo2.show();
    }
}
