public class RoundHole {
    public double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void fits(RoundPeg rp) {
        if (rp.getRadius() <= this.radius) {
            System.out.println("Round peg of radius " + rp.getRadius() + " DOES fits in round hole of radius " + this.radius);
            return;
        }
        System.out.println("Round peg of radius " + rp.getRadius() + " DOES NOT fit in round hole of radius " + this.radius);
        
    }
}
