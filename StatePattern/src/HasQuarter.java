public class HasQuarter implements GumballState {
    
    //Each state will contain a reference to the original system
    //This will all the state to change the system's state during an transitional action
    GumballMachine gm;
    public HasQuarter(GumballMachine g) {
        this.gm = g;
    }

    @Override
    public void addQuarter() {
        System.out.println("Quarter already inserted");
    }
    
    @Override
    public void ejectQuarter() {
        System.out.println("Quarter is being ejected");
        gm.setState(gm.getNoQuarterState());
    }
    
    @Override
    public void turnCrank() {
        System.out.println("Gumball is being dispensed!");
        gm.setState(gm.getSoldState());
    }
    
    @Override
    public void dispense() {
        System.out.println("No gumball being dispensed");
    }
}
