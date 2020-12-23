public abstract class Beverage {

    //This is the base class
    //Inherited classes can function as themselves without addons 

    String description = "Drink";

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}
