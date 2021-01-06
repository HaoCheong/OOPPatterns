public class App {

    //MEMENTO PATTERN

    //This patterns is used to record the state/mementos of an object prior to an action
    //This has multiple uses: To return to a previous state if a certain event was to fail, get the previous state to check the data within them
    //Has 3 components: Originator, Memento, Caretaker
    
    public static void main(String[] args) throws Exception {
        System.out.println("-------- Simple Game Saver --------");

        //Initialise the caretaker and originator class
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        //Saving the second copy of the game save
        originator.setSave("Game 1", "1-Nov-2021");
        originator.setSave("Game 2", "8-Nov-2021");
        caretaker.addMemento(originator.save());

        //Adding a third copy of the save and saving it to memento
        originator.setSave("Game 3", "15-Nov-2021");
        caretaker.addMemento(originator.save());

        //Set new save state and returning to the previosu recorded memento
        originator.setSave("Game 4", "20-Nov-2021");
        originator.load(caretaker.getMemento());
    }
}
