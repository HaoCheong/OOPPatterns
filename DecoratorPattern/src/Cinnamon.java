public class Cinnamon extends AddOnDecorator {

    Beverage beverage;

    public Cinnamon(Beverage b) {
        this.beverage = b;
    }

    public String getDescription() {
        return beverage.getDescription() + " and Cinnamon";
    }

    public double getCost() {
        return beverage.getCost() + 0.5;
    }
}
