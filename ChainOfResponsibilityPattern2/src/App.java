public class App {

    //CHAIN OF RESPONSIBILITY PATTERN

    //Suppose that one wants to do checks on a number of things
    //While one can create a large verification loop, one can also set up a chain of verifiers to do the checking
    //The example below is a simple example so the chain of responsibility is not necessary
    //Larger more complicated (see ChainOfResponsibilityPattern) examples will benefit from this
    //Kinda uses linked list pattern to do the checking
    //Abstract the responsibilities to separate classes
    //Not commonly used unless the a sequential structure is used (Log in verification is a good example of this)

    public static void main(String[] args) throws Exception {
        System.out.println("-------- New Astronaut Checkup --------");

        Handler handler = new WeightCheck();
        handler.linkWith(new HearingCheck()).linkWith(new EyeCheck());

        int p1Weight = 75;
        int p1Hearing = 10;
        int p1Eyes = 8;

        DoctorOffice docOff = new DoctorOffice();
        
        docOff.setHandler(handler);
        docOff.healthCheckUp(p1Weight, p1Eyes, p1Hearing);
    }
}
