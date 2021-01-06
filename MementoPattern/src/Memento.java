public class Memento {

    //Memento Class
    //Class which records all the information of the originator class' variables
    //Will have getters for all variables

    private String saveName;
    private String saveDate;

    public Memento(String saveName, String saveDate) {
        this.saveName = saveName;
        this.saveDate = saveDate;
    }

    public String getSaveName() {
        return saveName;
    }

    public String getSaveDate() {
        return saveDate;
    }
}