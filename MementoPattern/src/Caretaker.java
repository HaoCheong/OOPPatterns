import java.util.ArrayList;

public class Caretaker {

    //Caretaker class
    //Store copy of the memento object and get the required mementos when asked
    //Not necessary if only storing one copy of the previous memento but for multiple, it would be useful

    private ArrayList<Memento> mementos = new ArrayList<>();

    //Add memento to array
    public void addMemento(Memento m) {
        mementos.add(m);
    }

    //Get most recently added memento
    public Memento getMemento() {
        return mementos.get(1);
    }
}
