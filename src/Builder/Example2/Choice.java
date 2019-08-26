package Builder.Example2;

public abstract class Choice {
    protected Query query;

    public Query getQuery() {
        return query;
    }

    public void createQuery() {
        query = new Query();
    }

    public abstract void buildPizzaDough();
    public abstract void buildPizzaSauce();
    public abstract void buildPizzaIngredients();
}
