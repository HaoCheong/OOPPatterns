public class Airship implements Weapon {

    private double weight;
    private int cost;
    private String name;

    public Airship(String name, int cost, double weight) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }
    public int getCost() {
        return this.cost;
    }
    public String getName() {
        return this.name;
    }
}
