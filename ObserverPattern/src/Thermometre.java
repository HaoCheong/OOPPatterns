import java.util.ArrayList;

public class Thermometre implements Subject {
    public int temperature;
    public String type;
    public ArrayList<Observer> observers;

    public Thermometre() {
        this.temperature = 30;
        this.type = "C";
        this.observers = new ArrayList<>();
    }

    public void raiseTemp(int temp) {
        this.temperature += temp;
        notifyObservers();
    }

    public void reduceTemp(int temp) {
        this.temperature -= temp;
        notifyObservers();
    }

    public void changeType(String type) {
        this.type = type;
        notifyObservers();
    }   

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, type);
        }
    }

    @Override
    public void addObserver(Observer o) {
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }
}
