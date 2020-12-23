public interface Subject {

    //Subject interface
    //Has three operation, adding observers, removing and notifying observers

    public void notifyObservers();
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
}
