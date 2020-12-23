public class CyberpunkFactory implements AbstractFactory {

    //The Cyberpunk factory which creates cyberpunk items

    public BionicArm makeArm() {
        return new CyberpunkArm();
    }
    public Airship makeAirship() {
        return new CyberpunkAirship();
    }
}
