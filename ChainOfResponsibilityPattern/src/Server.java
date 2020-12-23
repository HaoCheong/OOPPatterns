import java.util.HashMap;
import java.util.Map;

public class Server {
    private Map<String, String> users = new HashMap<>();
    private Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public Boolean login(String email, String password) {
        if (handler.check(email, password)) {
            System.out.println("Login authorised");
            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public Boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public Boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}
