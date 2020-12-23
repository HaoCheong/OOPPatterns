public class WeightCheck extends Handler {
    public Boolean check(int weight, int eyeDist, int hearingDecib) {
        if (weight > 80) {
            System.out.println("Is overweight!");
            return false;
        } else if (weight < 50) {
            System.out.println("Is underweight!");
            return false;
        }
        System.out.println("Weight is fine!");
        return checkNext(weight, eyeDist, hearingDecib);
    }
}
