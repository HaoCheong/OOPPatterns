import java.util.ArrayList;

public class Platoon {

    //Example of a composite
    //Contains an array of troops
    //The platoons strength is the AVERAGE of all troops

    private String name;
    private ArrayList<Soldier> troops;

    public Platoon(String name) {
        this.name = name;
        this.troops = new ArrayList<>();
    }

    public double getStrength() {
        double avg = 0;
        for (Soldier s : troops) {
            System.out.println(s.getName() + " joins the fight!");
            avg += s.getStrength();
        }
        return avg/troops.size();

    }

    public String getName() {
        return name;
    }

    public void addTroop(Soldier s) {
        troops.add(s);
    }
}
