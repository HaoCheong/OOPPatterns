public class Power implements Operation {
    @Override
    public double doCalculation(int num1, int num2) {
        double ans = 1;
        for (int i = 0; i < num2; i++) {
            ans = ans * num1;
        }
        return ans;
    }

    @Override
    public String opName() {
        return "Power";
    }
}
