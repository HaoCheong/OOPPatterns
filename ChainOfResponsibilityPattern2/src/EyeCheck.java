public class EyeCheck extends Handler {
    
    public Boolean check(int weight, int eyeDist, int hearingDecib) {
        if (eyeDist < 5) {
            System.out.println("Has short-sightedness");
            return false;
        } else if (eyeDist > 10) {
            System.out.println("Has long-sightedness");
            return false;
        }
        System.out.println("Eyes are fine!");
        return checkNext(weight, eyeDist, hearingDecib);
    }
}
