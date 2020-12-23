public class SteampunkAirship implements Airship {

    private String name;
    private int speed;
    private String description;

    public SteampunkAirship() {
        name = "Steampunk Dreadnaught";
        speed = 10000;
        description = "A diesel powered A-Class dreadnaught";
    }
    
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public String getDesc() {
        return this.description;
    }
}
