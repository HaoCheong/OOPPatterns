public class App {

    //OBSERVER PATTERN

    //Uses the idea of observer and subject
    //Observers observes subjects and outputs and do the associated processes when any details of the subjects changes
    //Subjects will house observers and notify all of them if any details change

    //One might think "What if an observer uses completely different data, would I need a different "update" method: No"
    //If the case does require separate data, the options are: Use a different pattern, pass all data both observers need into the signature

    public static void main(String[] args) throws Exception {
        System.out.println("-------- Temperature Control --------");
        Thermometre thermo = new Thermometre();
        thermo.addObserver(new Display());
        thermo.addObserver(new Heater());

        System.out.println("--- Raising Temperatures ---");
        thermo.raiseTemp(15);

        System.out.println("--- Lowering Temperatures ---");
        thermo.reduceTemp(30);

        System.out.println("--- Changing Celsius to Farenheit ---");
        thermo.changeType("F");

        System.out.println("--- Changing Farenheit to Kelvin ---");
        thermo.changeType("K");

        System.out.println("--- Changing Kelvin to Celsius ---");
        thermo.changeType("C");

        System.out.println("--- Raising Temperatures Again ---");
        thermo.raiseTemp(5);


    }
}
