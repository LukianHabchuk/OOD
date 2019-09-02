package Decorator;

public class Main {
    public static void main(String[] args) {

        Pizza simplePizza = new SimplePizza();
        System.out.println("Ingreients: "+simplePizza.getIngredients()+" %nCost: "+simplePizza.getCost());

        Pizza pizzaWithMushrooms = new PizzaWithMushrooms(new SimplePizza());
        System.out.println("Ingreients: "+pizzaWithMushrooms.getIngredients()+" %nCost: "+pizzaWithMushrooms.getCost());

        Pizza pizzaWithAll = new PizzaWithMushrooms(new PizzaWithSausages(new SimplePizza()));
        System.out.println("Ingreients: "+pizzaWithAll.getIngredients()+" %nCost: "+pizzaWithAll.getCost());
    }
}
