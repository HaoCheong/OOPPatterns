public class SteampunkArm implements BionicArm {
    private String name;
    private int power;
    private String description;

    public SteampunkArm() {
        name = "Steampunk Arm";
        power = 100;
        description = "A steam powered arm with clockwork mechanisms built into it";
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
