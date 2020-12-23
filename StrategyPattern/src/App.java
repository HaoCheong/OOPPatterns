public class App {

    //STRATEGY PATTERN
    //Strategy pattern utilises the idea of polymorphism to allow users to dynamically change functions in runtime
    //Given that one needs a function to do different things to a fixed set of variables based on a condition, this pattern will be best
    //It is easily extendable

    public static void main(String[] args) throws Exception {
        System.out.println("-------- Strategic Calculations --------");
        int n1 = 3;
        int n2 = 5;

        Operation op = null;

        String[] allOps = {"add", "sub", "div", "mul", "pow"};

        for (String o : allOps) {
            switch(o) {
                case "add":
                    op = new Addition();
                    break;
                case "sub":
                    op = new Subtraction();
                    break;
                case "div":
                    op = new Division();
                    break;
                case "mul":
                    op = new Multiplication();
                    break;
                case "pow":
                    op = new Power();
                    break;
            }
            System.out.println(op.opName() + ": " + op.doCalculation(n1, n2));
        }

    }
}
