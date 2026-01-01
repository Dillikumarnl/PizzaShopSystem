abstract class ToppingsDecorator extends Pizza{
    protected Pizza pizza;

    public ToppingsDecorator(Pizza pizza){
        super(pizza.description, pizza.baseCost);
        this.pizza = pizza;
    }

    @Override
    public abstract String getDescription();

    @Override
    public abstract double getCost();

}
