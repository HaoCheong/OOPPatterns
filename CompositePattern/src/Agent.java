public class Agent implements Component {
    private double strength;
    private String name;

    //Example of a leaf
    //Similar to soldier, only return strength but parent node is an army, not a platoon

    public Agent(String name, double strength) {
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
