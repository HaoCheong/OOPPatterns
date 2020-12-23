public class App {

    //BUILDER PATTERN

    //Some objects are very complex, each requiring a number of objects and can be configured differently
    //While it is "possible" to create large constructors to do so, it is very bad practice
    //Share similarities to factory patterns 
    //You create a builder which will be configured to constuct objects with the given requirements
    //Then the builder is invoked to create said specific object
    //A director can be used to set pre configurations which are to be applied to builders

    public static void main(String[] args) throws Exception {
        System.out.println("-------- Car Workshop --------");

        //This creates a lot of code
        //But it is useful to give more control of the objects creation

        System.out.println("--- Building Auto without a Director ---");

        AutoCarBuilder abc = new AutoCarBuilder();

        abc.setType(Type.SPORTS_CAR);
        abc.setSeats(2);
        abc.setEngine(new Engine(3.0,0));
        abc.setTransmission(Transmission.AUTOMATIC);
        abc.setTripComputer(new TripComputer());
        abc.setGPSNavigator(new GPSNavigator());

        Car c1 = abc.getResult();
        System.out.println("\n" + c1);


        //By using the director, presets can be made and have said configuration apply to the builder

        System.out.println("--- Building auto with a Director ---");
        
        CarDirector cd = new CarDirector();
        AutoCarBuilder abc2 = new AutoCarBuilder();
        cd.constructCityCar(abc2);

        Car c2 = abc2.getResult();
        System.out.println("\n" + c2);

        System.out.println("--- Building manual with a Director ---");

        ManualCarBuilder mcb = new ManualCarBuilder();
        cd.constructSUV(mcb);
        Manual mc = mcb.getResult();
        System.out.println("\n" + mc);

    }
}
