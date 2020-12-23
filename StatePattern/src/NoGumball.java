public class NoGumball implements GumballState {
    
    //Each state will contain a reference to the original system
    //This will all the state to change the system's state during an transitional action
    GumballMachine gm;
    public NoGumball(GumballMachine g) {
        this.gm = g;
    }

    @Override
    public void addQuarter() {
        System.out.println("Machine is sold out");
    }
    
    @Override
    public void ejectQuarter() {
        System.out.println("Cannot eject, no quarter inserted");
    }
    
    @Override
    public void turnCrank() {
        System.out.println("Turned, no gumballs though...");
    }
    
    @Override
    public void dispense() {
        System.out.println("No gumball being dispensed");
    }
}
