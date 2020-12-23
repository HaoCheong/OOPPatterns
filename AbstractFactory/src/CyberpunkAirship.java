public class CyberpunkAirship implements Airship {

    private String name;
    private int speed;
    private String description;

    public CyberpunkAirship() {
        name = "Cyberpunk Volta Ship";
        speed = 10000;
        description = "A red matter generated B-class ship";
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
