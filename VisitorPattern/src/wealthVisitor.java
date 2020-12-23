public class wealthVisitor implements Visitor {

    public double getWealth(Visitable v) {
        return v.accept(this);
    }

    @Override
    public double visitCorporation(Corporation c) {
        return c.getIncome() + c.getBribes() - c.getDonation();
    }

    @Override
    public double visitHousehold(Household h) {
        return h.getIncome() - h.getDonation();
    }

    @Override
    public double visitSmallBusiness(SmallBusiness sb) {
        return sb.getIncome() + sb.getBribes() - sb.getDonation();
    }

}
