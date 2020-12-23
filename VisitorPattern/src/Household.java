public class Household implements Visitable {
    private String name;
    private double income;
    private double donation;

    public Household(double donation, double income) {
        this.income = income;
        this.donation = donation;
        this.name = "Household";
    }
    
    @Override
    public double accept(Visitor v) {
        return v.visitHousehold(this);
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
}
