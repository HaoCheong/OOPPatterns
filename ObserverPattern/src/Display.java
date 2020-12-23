public class Display implements Observer {

    private double temp;
    private String type;
    
    @Override
    public void update(double temp, String type) {
        this.temp = temp;
        this.type = type;
        displayInfo();
    }

    public void displayInfo() {
        switch(this.type) {
            case "C":
                System.out.println("Current Temperature in Celsius: " + this.temp);
                break;
            case "F":
                System.out.println("Current Temperature in Farenheit: " + (this.temp * 2) + 30);
                break;
            case "K":
                System.out.println("Current Temperature in Kelvin: " + this.temp + 273);
                break;
        }
    }
}
