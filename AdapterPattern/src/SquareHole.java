public class SquareHole {

    public double width;

    public SquareHole(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public void fits(SquarePeg sp) {
        if (sp.getWidth() <= this.width) {
            System.out.println("Square peg of width " + sp.getWidth() + " DOES fits in square hole of width " + this.width);
            return;
        }
        System.out.println("Square peg of width " + sp.getWidth() + " DOES NOT fits in square hole of wdith " + this.width);
    }
}
