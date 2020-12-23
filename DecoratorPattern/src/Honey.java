public class Honey extends AddOnDecorator{
    Beverage beverage;

    public Honey(Beverage b) {
        this.beverage = b;
    }

    public String getDescription() {
        return beverage.getDescription() + " and Honey";
    }

    public double getCost() {
        return beverage.getCost() + 0.5;
    }
}
