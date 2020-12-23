public class Milk extends AddOnDecorator{
    Beverage beverage;

    public Milk(Beverage b) {
        this.beverage = b;
    }

    public String getDescription() {
        return beverage.getDescription() + " and Milk";
    }

    public double getCost() {
        return beverage.getCost() + 0.5;
    }
}
