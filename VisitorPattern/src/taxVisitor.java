public class taxVisitor implements Visitor {

    public double getTax(Visitable v) {
        return v.accept(this);
    }

    @Override
    public double visitCorporation(Corporation c) {
        return c.getIncome() * 0.05 - c.getDonation() * 0.10;
    }

    @Override
    public double visitHousehold(Household h) {
        return h.getIncome() * 0.35 - h.getDonation() * 0.05;
    }

    @Override
    public double visitSmallBusiness(SmallBusiness sb) {
        return sb.getIncome()* 0.30 + sb.getDonation() * 0.25;
    }

}
