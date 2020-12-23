public interface Visitor {

    //Visitor Class

    //This class will contain the methods to be applied to "visitable" classes
    //Each method correspond to an entity

    public double visitCorporation(Corporation c);
    public double visitHousehold(Household h);
    public double visitSmallBusiness(SmallBusiness sb);
}
