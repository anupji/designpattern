package com.design.pattern.javadp;

class BuilderPatternDemo {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder("Medium", "Thin").cheese(true).veggie(true).build();
        pizza.display();
    }
}

class Pizza{
    //required
    private String size;
    private String crust;

    //optional
    private boolean cheese;
    private boolean veggie;
    private boolean mushroom;

    private Pizza(PizzaBuilder pizzaBuilder){
        this.size = pizzaBuilder.size;
        this.crust = pizzaBuilder.crust;
        this.cheese = pizzaBuilder.veggie;
        this.veggie = pizzaBuilder.veggie;
        this.mushroom = pizzaBuilder.mushroom;
    }

    public void display(){
        System.out.println("Pizza Details:");
        System.out.println("Size: " + size);
        System.out.println("Crust: " + crust);
        System.out.println("Cheese: " + (cheese ? "Yes" : "No"));
        System.out.println("Pepperoni: " + (veggie ? "Yes" : "No"));
        System.out.println("Mushrooms: " + (mushroom ? "Yes" : "No"));
    }

    public static class PizzaBuilder{
        //required
        private String size;
        private String crust;

        //optional
        private boolean cheese;
        private boolean veggie;
        private boolean mushroom;

        public PizzaBuilder(String size,String crust){
            this.size = size;
            this.crust = crust;
        }

        public PizzaBuilder veggie(boolean veggie){
            this.veggie = true;
            return this;
        }
        public PizzaBuilder cheese(boolean cheese){
            this.cheese = true;
            return this;
        }
        public PizzaBuilder mushroom(boolean mushroom){
            this.mushroom = true;
            return this;
        }
        public Pizza build(){
            return new Pizza(this);
        }
    }
}