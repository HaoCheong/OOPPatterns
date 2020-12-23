public class UserExist extends Handler {
    
    private Server server;
    
    public UserExist(Server server) {
        this.server = server;
    }

    public Boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email has not been registered");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password for this email");
            return false;
        }
        return checkNext(email,password);
    }
}
