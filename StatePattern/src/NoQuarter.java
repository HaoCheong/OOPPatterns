public class NoQuarter implements GumballState {

    //Each state will contain a reference to the original system
    //This will all the state to change the system's state during an transitional action
    GumballMachine gm;
    public NoQuarter(GumballMachine g) {
        this.gm = g;
    }

    @Override
    public void addQuarter() {
        System.out.println("You insert a quarter");
        gm.setState(gm.getHasQuarterState());
    }
    
    @Override
    public void ejectQuarter() {
        System.out.println("Cannot eject, no quarter inserted");
    }
    
    @Override
    public void turnCrank() {
        System.out.println("You have not inserted a quarter yet");
    }
    
    @Override
    public void dispense() {
        System.out.println("You have to pay first");
    }
}
