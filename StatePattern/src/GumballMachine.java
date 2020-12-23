public class GumballMachine {

    //This is the class which represents the system containing all the states

    //There are all the possible state
    GumballState noGumballState;
    GumballState hasQuarterState;
    GumballState noQuarterState;
    GumballState soldState;

    GumballState currentState; // The current state which the system is in

    private int gumballCount = 0;

    public GumballMachine(int numGumball) {
        
        //Each state needs to be initialised with passing this object as a reference to them
        noGumballState = new NoGumball(this);
        hasQuarterState = new HasQuarter(this);
        noQuarterState = new NoQuarter(this);
        soldState = new Sold(this);

        this.gumballCount = numGumball;

        if (numGumball > 0) {
            this.currentState = noQuarterState;
        } else {
            this.currentState = noGumballState;
        }
    }

    //Here are all possible transitional actions
    public void addQuarter() {
        currentState.addQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    public void refill(int gumballs) {
        gumballCount = gumballCount + gumballs;
        currentState = noQuarterState;
    }

    public int getGumballCount() {
        return gumballCount;
    }

    public GumballState getState() {
        return currentState;
    }

    //Here are all the states which are available and can be referenced when needed
    public GumballState getSoldOutState() {
        return soldState;
    }

    public GumballState getNoQuarterState() {
        return noQuarterState;
    }

    public GumballState getHasQuarterState() {
        return hasQuarterState;
    }

    public GumballState getSoldState() {
        return soldState;
    }

    public void releaseBall() {
        System.out.println("Here comes a gumball");
        if (gumballCount != 0) {
            gumballCount = gumballCount - 1;
        }
    }

    //This allow the ability to set a new current state
    public void setState(GumballState state) {
        this.currentState = state;
    }

}
