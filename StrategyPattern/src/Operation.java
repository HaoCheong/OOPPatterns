public interface Operation {

    //This is the Strategy Interface, all operation of any strategy must have the methods of the interface
    //This is what allows for the polymorphism

    public double doCalculation(int num1, int num2);
    public String opName();
}
