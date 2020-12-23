public class App {

    //TEMPLATE METHOD

    //Suppose that you have multiple processes, all with similar code.
    //One can abstract out the code into a series of steps into another pattern
    //Some processes may have differing steps in between, those steps can be set to abstract and implemented later
    //A hook is an optional step containing a default body which are to be overidden when needed

    public static void main(String[] args) throws Exception {
        System.out.println("-------- Food Wars! Pie Edition --------");

        System.out.println("--- Eishi is making a MEAT PIE! ---");
        PieRecipeTemplate meatPie = new MeatPie();
        meatPie.makePie();

        System.out.println("--- Soma is making a CHOCOLATE PIE! ---");
        PieRecipeTemplate chocoPie = new ChocolatePie();
        chocoPie.makePie();

        System.out.println("First pie type = " + meatPie.getPieType());
        System.out.println("Second pie type = " + chocoPie.getPieType());

        System.out.println("You're Welcome!");
    }
}
