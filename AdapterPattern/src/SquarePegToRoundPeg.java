public class SquarePegToRoundPeg extends RoundPeg{
    
    //An Adapter class

    //Extends the "convert to" class
    //Takes in the "convert from" class

    private SquarePeg sp;

    public SquarePegToRoundPeg(SquarePeg sp) {
        this.sp = sp;
    }

    public double getRadius() {
        return (Math.sqrt(Math.pow((sp.getWidth() / 2), 2) * 2));
    }
}
