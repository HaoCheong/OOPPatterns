public class CyberpunkArm implements BionicArm {
    private String name;
    private int power;
    private String description;

    public CyberpunkArm() {
        name = "Cyberpunk Arm";
        power = 500;
        description = "A hightech arm powered by a small cold fusion reactor";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPower() {
        return this.power;
    }

    @Override
    public String getDesc() {
        return this.description;
    }
}
