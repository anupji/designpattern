package com.design.pattern.javadp;

class AbsBurgerFactoryDemo {
    public static void main(String[] args) {
        Burger burger = new AmericanNonVeggie();
        burger.prepare();
        Burger burger1 = new AmericanVeggie();
        burger1.prepare();
        Burger burger2 = new ItalianVeggie();
        burger2.prepare();
        Burger burger3 = new ItalianNonVeggie();
        burger3.prepare();
    }
}

abstract class BurgerFactory {
    abstract Burger createVeggie();
    abstract Burger createNonVeggie();
}

interface Burger {
    void prepare();
}

class AmericanVeggie implements Burger {
    @Override
    public void prepare() {
        System.out.println("American Veggie Burger");
    }
}

class AmericanNonVeggie implements Burger {
    @Override
    public void prepare() {
        System.out.println("American Beef Burger");
    }
}

class ItalianVeggie implements Burger {
    @Override
    public void prepare() {
        System.out.println("Italian Veggie Burger");
    }
}

class ItalianNonVeggie implements Burger {
    @Override
    public void prepare() {
        System.out.println("Italian Beef Burger");
    }
}

class AmericanBurger extends BurgerFactory {
    @Override
    Burger createVeggie() {
        return new AmericanVeggie();
    }

    @Override
    Burger createNonVeggie() {
        return new AmericanNonVeggie();
    }
}

class ItalianBurger extends BurgerFactory {
    @Override
    Burger createVeggie() {
        return new ItalianVeggie();
    }

    @Override
    Burger createNonVeggie() {
        return new ItalianNonVeggie();
    }
}