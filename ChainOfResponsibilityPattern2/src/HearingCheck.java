public class HearingCheck extends Handler {
    public Boolean check(int weight, int eyeDist, int hearingDecib) {
        if (hearingDecib > 20) {
            System.out.println("Has hearing problems");
            return false;
        }
        System.out.println("Ears are fine!");
        return checkNext(weight, eyeDist, hearingDecib);
    }
}
