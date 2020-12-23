public class SteampunkFactory implements AbstractFactory {

    //The Steampunk factory which creates steampunk items

    public BionicArm makeArm() {
        return new SteampunkArm();
    }
    public Airship makeAirship() {
        return new SteampunkAirship();
    }
}
