public class App {

    //ABSTRACT FACTORY PATTERN

    //A step further in terms of abstration compared to the Factory method
    //Instead, the factories themselves are also abstract out
    //This allows factories who share the objects which are created but have different values or type to them
    //Very useful when there are numerous items which share the same base but have different value which all have to be created (2x2)
    //Easy to expand further, should be used if number of things are expected to change
    //Very time consuming if the number of items is low

    public static void main(String[] args) throws Exception {
        System.out.println("-------- Cyberpunk Vs Steampunk --------");

        AbstractFactory cyberFactory = new CyberpunkFactory(); //Cyberpunk Factory
        AbstractFactory steamFactory = new SteampunkFactory(); //Steam Factory
        
        BionicArm steamArm = steamFactory.makeArm();
        BionicArm cyberArm = cyberFactory.makeArm();

        Airship steamAir = steamFactory.makeAirship();
        Airship cyberAir = cyberFactory.makeAirship();

        System.out.println("-------- Bionic Arm Round --------");
        System.out.println("Name: " + steamArm.getName() + ", power: " + steamArm.getPower());
        System.out.println("Description: " + steamArm.getDesc());
        
        System.out.println("Name: " + cyberArm.getName() + ", power: " + cyberArm.getPower());
        System.out.println("Description: " + cyberArm.getDesc());

        System.out.println("-------- Airhip Round --------");
        System.out.println("Name: " + steamAir.getName() + ", speed: " + steamAir.getSpeed());
        System.out.println("Description: " + steamAir.getDesc());
        
        System.out.println("Name: " + cyberAir.getName() + ", power: " + cyberAir.getSpeed());
        System.out.println("Description: " + cyberAir.getDesc());
    }
}
