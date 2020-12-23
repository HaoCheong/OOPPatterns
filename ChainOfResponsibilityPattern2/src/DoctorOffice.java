public class DoctorOffice {
    private Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public Boolean healthCheckUp(int weight, int eyeDist, int hearingDecib) {
        if (handler.check(weight, eyeDist, hearingDecib)) {
            System.out.println("This person passes all the health checks!");
            return true;
        }
        System.out.println("This person failed the health checks");
        return false;
    }
}
