public class SmallBusiness implements Visitable {
    private String name;
    private double income;
    private double donation;
    private double bribes;

    public SmallBusiness(double donation, double income, double bribes) {
        this.income = income;
        this.bribes = bribes;
        this.donation = donation;
        this.name = "Small Business";
    }
    
    @Override
    public double accept(Visitor v) {
        return v.visitSmallBusiness(this);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncome() {
        return this.income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getDonation() {
        return this.donation;
    }

    public void setDonation(double donation) {
        this.donation = donation;
    }

    public double getBribes() {
        return this.bribes;
    }

    public void setBribes(double bribes) {
        this.bribes = bribes;
    }
}
