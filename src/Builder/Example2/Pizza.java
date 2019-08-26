package Builder.Example2;

public class Pizza extends Choice {
    @Override
    public void buildPizzaDough() {
        query.setPizzaDough("XL, thin");
    }

    @Override
    public void buildPizzaSauce() {
        query.setPizzaSauce("barbeque");
    }

    @Override
    public void buildPizzaIngredients() {
        query.setPizzaIngredients("parmesan, bacon, mushrooms");
    }
}
