package aco.patterns.factory.pizza;

public class TestPizza {
    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Yurii ordered a " + pizza.getName() + "\n");





    }
}




