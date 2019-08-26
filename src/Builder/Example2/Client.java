package Builder.Example2;

public class Client {

    private Choice choice;

    public void setChoice(Choice choice) {
        this.choice = choice;
    }

    public Query acceptQuery() {
        System.out.println("Order is accepted");
        return choice.getQuery();
    }

    public void buildPizza() {
        choice.createQuery();
        choice.buildPizzaDough();
        choice.buildPizzaSauce();
        choice.buildPizzaIngredients();
    }
}
