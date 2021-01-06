public class Originator {

    //Originator Class
    //This is the class which will data is to be stored
    //In this example, the class is a save game data class which needs to be recorded

    private String saveName;
    private String saveDate;

    public void setSave(String saveName, String saveDate) {
        System.out.println("Game recording current data: " + saveName + ", " + saveDate);
        this.saveName = saveName;
        this.saveDate = saveDate;
    }

    public Memento save() {
        System.out.println("Originator: Saving game data to Memento");
        return new Memento(saveName, saveDate);
    }

    public void load(Memento m) {
        saveName = m.getSaveName();
        saveDate = m.getSaveDate();
        System.out.println("Originator: Save game data after restoring from memento: " + saveName + ", " + saveDate);
    }

}
