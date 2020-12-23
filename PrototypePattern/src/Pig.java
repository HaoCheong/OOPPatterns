public class Pig implements Animal, Prototype {
    private String name;
    private double weight;
    private int bacon;

    public Pig(String name, double weight, int bacon) {
        this.name = name;
        this.weight = weight;
        this.bacon = bacon;
    }

    public Pig(Pig p) {
        this.name = p.getName();
        this.weight = p.getWeight();
        this.bacon = p.getBacon();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    public int getBacon() {
        return this.bacon;
    }

    @Override
    public Pig getClone() {
        return new Pig(this);
    }
}
