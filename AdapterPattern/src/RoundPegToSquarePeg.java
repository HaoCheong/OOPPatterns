public class RoundPegToSquarePeg extends SquarePeg {
    
    //An Adapter class

    //Extends the "convert to" class
    //Takes in the "convert from" class
    
    private RoundPeg rp;

    public RoundPegToSquarePeg(RoundPeg rp) {
        this.rp = rp;
    }

    @Override
    public double getWidth() {
        return rp.radius * 2;
    }
}
