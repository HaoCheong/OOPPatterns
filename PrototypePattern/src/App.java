public class App {

    //PROTOTYPE PATTERN
    //During developments, when an object is to be copied, one has to go through all the data in the object and copy the data into ta constructor 1 by 1
    //However, some values may have been have been restricted so access may not be complete
    //Instead, the Prototype pattern affords the ability for a object to be cloned via a function

    public static void main(String[] args) throws Exception {
        System.out.println("-------- Dolly and Friends --------");
        Cow c = new Cow("Bessy", 200.0, 5);
        Sheep s = new Sheep("Dolly", 150.0, 3);
        Pig p = new Pig("Peppa", 300.0, 250);

        System.out.println("ORIGINAL Name: " + c.getName() + ", Weight: " + c.getWeight() + " kg, Produces: " + c.getMilk() + " gallons of milk");
        System.out.println("ORIGINAL Name: " + s.getName() + ", Weight: " + s.getWeight() + " kg, Produces: " + s.getWool() + " bags of wool");
        System.out.println("ORIGINAL Name: " + p.getName() + ", Weight: " + p.getWeight() + " kg, Produces: " + p.getBacon() + " kg of bacon");

        System.out.println("Cloning Dolly and friends...");
        Cow cClone = c.getClone();
        Sheep sClone = s.getClone();
        Pig pClone = p.getClone();

        System.out.println("CLONED Name: " + cClone.getName() + ", Weight: " + cClone.getWeight() + " kg, Produces: " + cClone.getMilk() + " gallons of milk");
        System.out.println("CLONED Name: " + sClone.getName() + ", Weight: " + sClone.getWeight() + " kg, Produces: " + sClone.getWool() + " bags of wool");
        System.out.println("CLONED Name: " + pClone.getName() + ", Weight: " + pClone.getWeight() + " kg, Produces: " + pClone.getBacon() + " kg of bacon");
    }
}
