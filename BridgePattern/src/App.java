public class App {

    //BRIDGE PATTERN

    //This pattern relys on understanding of the 2 levels of hierarchy: Abstraction -> Implementation
    //On the "Abstraction" level, it delegates some/most of the the calls to the "Implementation" object
    //Since all implementation will have a common interface, they are hence interchangable
    //Used when needing to split closely related large class/classes into two separate hierarchies
    
    //Abstraction level in this case is "Device"
    //Implementation level in this case is "Remote"

    public static void main(String[] args) throws Exception {
        System.out.println("-------- Remotes and TVs --------");
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Testing with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Testing with advance remote");
        AdvanceRemote advanceRemote = new AdvanceRemote(device);
        advanceRemote.power();
        advanceRemote.mute();
        device.printStatus();
    }
}
