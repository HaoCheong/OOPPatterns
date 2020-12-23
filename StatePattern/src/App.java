public class App {

    //STATE PATTERN

    //This pattern is used when the system in question can be mapped out as a finite state machine
    //Some system may at first seem like finite state machine at first
    //Usually, its best if the system has complicated stransitioning process
    //Also its best if there are at least 4 or more possible states

    public static void main(String[] args) throws Exception {
        System.out.println("-------- First Gumball Machine --------");
        GumballMachine gm1 = new GumballMachine(10);
        gm1.addQuarter();
        gm1.turnCrank();

        System.out.println("-------- Second Gumball Machine --------");
        GumballMachine gm2 = new GumballMachine(0);
        gm2.addQuarter();
        gm2.turnCrank();

        gm2.refill(5);

        gm2.addQuarter();
        gm2.turnCrank();
        gm2.turnCrank();

    }
}
