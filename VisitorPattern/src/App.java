public class App {

    //VISITOR PATTERN

    //Suppose that one has multiple entities all which one wants to apply a similar operation to each entity
    //Instead of having all the code within the classes themselves, the visitor separates the function to visitor class
    //It will do the processing on behalf of the other class

    public static void main(String[] args) throws Exception {
        System.out.println("-------- The Tax Man and Wealth Evaluator --------");
        Household h = new Household(300, 80000);
        SmallBusiness sb = new SmallBusiness(3000, 1000000, 3500);
        Corporation c = new Corporation(10000, 5000000, 250000);

        System.out.println("--- Tax Man Visiting ---");
        taxVisitor tv = new taxVisitor();
        System.out.println(c.getName() + " taxes: $" + tv.getTax(c));
        System.out.println(sb.getName() + " taxes: $" + tv.getTax(sb));
        System.out.println(h.getName() + " taxes: $" + tv.getTax(h));

        System.out.println("--- Wealth Evaluator Visiting ---");
        wealthVisitor wv = new wealthVisitor();
        System.out.println(c.getName() + " Wealth: $" + wv.getWealth(c));
        System.out.println(sb.getName() + " Wealth: $" + wv.getWealth(sb));
        System.out.println(h.getName() + " Wealth: $" + wv.getWealth(h));
    }
}
