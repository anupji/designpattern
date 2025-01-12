package com.design.pattern.factorymethod;

class BurgerFactoryDemo {
    public static void main(String[] args) {
        Restaurant veggieRestaurant = new VeggieBurgerRestaurant();
        veggieRestaurant.orderBurger();
        Restaurant beefRestaurant = new BeefBurgerRestaurant();
        beefRestaurant.orderBurger();
    }
}


/*class BurgerFactory {
    public Burger createBurger(String request) {
        Burger burger = null;
        if (request.equals("BEEF")) {
            burger = new BeefBurger();
        } else if (request.equals("VEGGIE")) {
            burger = new VeggieBurger();
        }
        return burger;
    }
}*/

/*class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger(String request) {
        Burger burger = null;
        if (request.equals("ITALIAN")) {
            burger = new ItalianVeggieBurger();
        } else {
            burger = new AmericanVeggieBurger();
        }
        return burger;
    }
}*/

/*class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger(String request) {
        Burger burger = null;
        if (request.equals("ITALIAN")) {
            burger = new ItalianBeefBurger();
        } else {
            burger = new AmericanVeggieBurger();
        }
        return burger;
    }
}*/

class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}

class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}

abstract class Restaurant {
    public Burger orderBurger(){
        /*Burger burger = null;
        if (request.equals("BEEF")) {
            burger = new BeefBurger();
        } else if (request.equals("VEGGIE")) {
            burger = new VeggieBurger();
        }*/
        //BurgerFactory burgerFactory = new BurgerFactory();
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }
    public abstract Burger createBurger();
}

interface Burger{
    public void prepare();
}

class VeggieBurger implements Burger{
    int burgerId;
    boolean combo;
    String addOns;
    public void prepare(){
        System.out.println("Veggie Burger ");
    }
}

class BeefBurger implements Burger{
    int burgerId;
    boolean angus;
    String addOns;
    public void prepare(){
        System.out.println("Beef Burger ");
    }
}