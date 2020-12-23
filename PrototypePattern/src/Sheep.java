public class Sheep implements Animal, Prototype{
    private String name;
    private double weight;
    private int wool;


    //Regular sheep constructor
    public Sheep(String name, double weight, int wool) {
        this.name = name;
        this.weight = weight;
        this.wool = wool;
    }

    //Cloning constructor, passes reference of itself into the constructor and "clone" itself
    public Sheep(Sheep s) {
        this.name = s.getName();
        this.weight = s.getWeight();
        this.wool = s.getWool();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    public int getWool() {
        return this.wool;
    }

    //Passes reference of itself into its own clone constructor
    @Override
    public Sheep getClone() {
        return new Sheep(this);
    }
}
