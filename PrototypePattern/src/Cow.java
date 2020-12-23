public class Cow implements Animal, Prototype {
    private String name;
    private double weight;
    private int milk;

    public Cow(String name, double weight, int milk) {
        this.name = name;
        this.weight = weight;
        this.milk = milk;
    }

    public Cow(Cow c) {
        this.name = c.getName();
        this.weight = c.getWeight();
        this.milk = c.getMilk();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    public int getMilk() {
        return this.milk;
    }

    @Override
    public Cow getClone() {
        return new Cow(this);
    }
}
