public interface Visitable {

    //Visitable Class

    //All entities present will implement this class
    //Allow them to accept a visitor and pass themselves into the visitor

    public double accept(Visitor v);
}
