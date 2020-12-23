public class App {

    //COMPOSITE PATTERN
    //This pattern uses the inherent tree structure of a system to recursively access all the data down the tree
    //Two types of components in this pattern, Composites and Leaves
    //Composites are objects which contains leaves and may contain ther composites
    //Leaves are objects which contain neither leaves or composites
    //Main difference: Composites have arrays of other components, leaves do not
    //You can also make changes to how each "composite" recursively calculates its leaf data

    public static void main(String[] args) throws Exception {
        System.out.println("-------- Star Wars Strength --------");
        Army rebels = new Army("Rebellion");

        Agent agent1 = new Agent("Luke Skywalker", 60);
        Platoon platoon1 = new Platoon("The Republic Forces");
        Soldier s1 = new Soldier("Han Solo", 25);
        Soldier s2 = new Soldier("Princess Leia", 20);
        Soldier s3 = new Soldier("Chewbacca", 35);
        Platoon platoon2 = new Platoon("The Cloud City Forces");
        Soldier s4 = new Soldier("Lando", 25);
        Soldier s5 = new Soldier("C3P0", 5);
        Soldier s6 = new Soldier("R2D2", 10);

        rebels.addAgent(agent1);
        rebels.addPlatoon(platoon1);
        rebels.addPlatoon(platoon2);
        platoon1.addTroop(s1);
        platoon1.addTroop(s2);
        platoon1.addTroop(s3);
        platoon2.addTroop(s4);
        platoon2.addTroop(s5);
        platoon2.addTroop(s6);

        Army empire = new Army("Empire");
        Agent agent2 = new Agent("Darth Vader", 100);
        Agent agent3 = new Agent("Boba Fett", 40);
        Platoon platoon3 = new Platoon("The Tatooine Forces");
        Soldier s7 = new Soldier("Stormtrooper 1", 15);
        Soldier s8 = new Soldier("Stormtrooper 2", 15);
        Soldier s9 = new Soldier("Stormtrooper 3", 15);
        Platoon platoon4 = new Platoon("The Jakku Forces");
        Soldier s10 = new Soldier("Stormtrooper 4", 15);
        Soldier s11 = new Soldier("Stormtrooper 5", 15);
        Soldier s12 = new Soldier("Dark Trooper 3", 30);

        empire.addAgent(agent2);
        empire.addAgent(agent3);
        empire.addPlatoon(platoon3);
        empire.addPlatoon(platoon4);
        platoon3.addTroop(s7);
        platoon3.addTroop(s8);
        platoon3.addTroop(s9);
        platoon4.addTroop(s10);
        platoon4.addTroop(s11);
        platoon4.addTroop(s12);

        System.out.println("<<<<<<<< Getting EMPIRE Strength >>>>>>>>");
        double totalEmpireStrength = empire.getStrength();
        System.out.println("<<<<<<<< Getting REBELS Strength >>>>>>>>");
        double totalRebelStrength = rebels.getStrength();

        System.out.println("");
        System.out.println("Fight!");
        System.out.println("");

        System.out.println("Empire Strength: " + totalEmpireStrength);
        System.out.println("Rebels Strength: " + totalRebelStrength);

        if (totalEmpireStrength < totalRebelStrength) {
            System.out.println("The REBEL WINS! May the force be with you!");
        } else if (totalEmpireStrength > totalRebelStrength) {
            System.out.println("The EMPIRE WINS! Long Live the Empire!");
        } else {
            System.out.println("Its a DRAW! Bringing balance to the force!");
        }
    }
}
