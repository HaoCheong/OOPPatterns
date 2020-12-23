public class Addition implements Operation {

    @Override
    public double doCalculation(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public String opName() {
        return "Addition";
    }
}