public class Sold implements GumballState{

    //Each state will contain a reference to the original system
    //This will all the state to change the system's state during an transitional action
    GumballMachine gm;
    public Sold(GumballMachine g) {
        this.gm = g;
    }

    @Override
    public void addQuarter() {
        System.out.println("Please wait, gumball is being dispensed");
    }
    
    @Override
    public void ejectQuarter() {
        System.out.println("You turned the crank already");
    }
    
    @Override
    public void turnCrank() {
        System.out.println("Please stop turning the crank");
    }
    
    @Override
    public void dispense() {
        gm.releaseBall();
        if (gm.getGumballCount() > 0) {
            gm.setState(gm.getNoQuarterState());
        } else {
            gm.setState(gm.getSoldOutState());
        }
    }
}
