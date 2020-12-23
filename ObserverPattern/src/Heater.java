public class Heater implements Observer {

    private double temp;
    
    @Override
    public void update(double temp, String type) {
        this.temp = temp;
        setHeater();
    }

    public void setHeater() {
        if (this.temp > 30) {
            System.out.println("Heater Setting: OFF");
        } else if (this.temp < 16) {
            System.out.println("Heater Setting: HIGH");
        } else {
            System.out.println("Heater Setting: LOW");
        }
    }
}
