public class App {

    //DECORATOR PATTERN

    //Works similarly to strategy but with a slight difference
    //This pattern allows addition functionality to be added dynamically, but the base object can function alone if needed
    //Each time an additional function is added, a reference of its previous self is passed in
    //When called, the function recursively calls inwards, like a Matryoshka Doll

    public static void main(String[] args) throws Exception {
        System.out.println("-------- Coffee Talks --------");
        Beverage order1 = new Coffee();
        Beverage order2 = new GreenTea();
        Beverage order3 = new HotChocolate();

        order1 = new Milk(order1);
        order1 = new Milk(order1);
        
        order2 = new Milk(order2);
        order2 = new Cinnamon(order2);

        order3 = new Honey(order3);
        order3 = new Milk(order3);

        System.out.println("--- Cafe Latte ---");
        System.out.println("Ingredients: " + order1.getDescription());
        System.out.println("Cost: $" + order1.getCost());

        System.out.println("--- Matcha Latte ---");
        System.out.println("Ingredients: " + order2.getDescription());
        System.out.println("Cost: $" + order2.getCost());

        System.out.println("--- Honey Chocolate ---");
        System.out.println("Ingredients: " + order3.getDescription());
        System.out.println("Cost: $" + order3.getCost());

    }
}
