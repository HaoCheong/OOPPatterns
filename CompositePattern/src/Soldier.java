public class Soldier implements Component{

    //Example of a Leaf component
    //Only returns a strength, no calculation done

    private double strength;
    private String name;

    public Soldier(String name, double strength) {
        this.name = name;
        this.strength = strength;
    }

    public double getStrength() {
        return strength;
    }

    public String getName() {
        return name;
    }
}
