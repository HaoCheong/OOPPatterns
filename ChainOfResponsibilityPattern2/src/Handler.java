public abstract class Handler {
    
    //Handler Class

    //An abstract class containing the boiler plate code

    private Handler next; //Next handler to be checked

    //Link this handler with another, returns itself as well to simplify linking
    public Handler linkWith(Handler next) {
        this.next = next;
        return next;
    }

    //The checker, implemented differently for each checker
    public abstract Boolean check(int weight, int eyeDist, int hearingDecib);

    //The "iterator" so to speak to move to the next linked handler
    protected boolean checkNext(int weight, int eyeDist, int hearingDecib) { 
        //If next is null, it has reached the end and will return true (all checks passed)
        if (next == null) {
            return true;
        }
        return next.check(weight, eyeDist, hearingDecib);
    }
}
