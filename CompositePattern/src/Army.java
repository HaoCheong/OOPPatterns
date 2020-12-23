import java.util.ArrayList;

public class Army {

    //Example of a composite
    //Contains 2 arrays, an array of composite (platoons) and an array of leaves (agents)
    //The strength is calculated by the sum TOTAL of all components

    private String name;
    private ArrayList<Platoon> platoons;
    private ArrayList<Agent> agents;

    public Army(String name) {
        this.name = name;
        this.platoons = new ArrayList<>();
        this.agents = new ArrayList<>();
    }

    public double getStrength() {
        double total = 0;
        for (Platoon p : platoons) {
            System.out.println(p.getName() + " joins the fight!");
            total += p.getStrength();
        }
        for (Agent a : agents) {
            System.out.println(a.getName() + " joins the fight!");
            total += a.getStrength();
        }
        return total;

    }

    public String getName() {
        return name;
    }

    public void addPlatoon(Platoon p) {
        platoons.add(p);
    }

    public void addAgent(Agent a) {
        agents.add(a);
    }
}