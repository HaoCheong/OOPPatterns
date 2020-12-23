public class App {

    //ADAPTER PATTERN

    //This pattern allows components which are do not share the same base to work with each other
    //Objects are passed into an intermediary class, which itself extends the class to be converted to, and create an adapt the values and override methods to work with the other class' methods
    
    public static void main(String[] args) throws Exception {
        System.out.println("-------- Baby Blocks and Shapes --------");
        RoundPeg rp = new RoundPeg(5);
        SquarePeg sp = new SquarePeg(5);
        RoundHole rh1 = new RoundHole(3);
        RoundHole rh2 = new RoundHole(10);
        SquareHole sh1 = new SquareHole(3);
        SquareHole sh2 = new SquareHole(10);

        System.out.println("--- Same to Same Comparison ---");
        rh1.fits(rp);
        rh2.fits(rp);
        sh1.fits(sp);
        sh2.fits(sp);

        System.out.println("--- Conversion via adaptor ---");
        SquarePeg rp2sp = new RoundPegToSquarePeg(rp);
        RoundPeg sp2rp = new SquarePegToRoundPeg(sp);
        rh1.fits(sp2rp);
        rh2.fits(sp2rp);
        sh1.fits(rp2sp);
        sh2.fits(rp2sp);
        
    }
}
