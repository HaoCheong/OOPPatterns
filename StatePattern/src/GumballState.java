public interface GumballState {

    //Here are all the possible transitional actions which a state could have
    //Some objects may have actions which have no effect, they are created regardless.
    //Error message are printed if needed for impossible actoins

    public void addQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
