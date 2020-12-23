public class RoleCheck extends Handler {
    public Boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Welcome back admin!");
            return true;
        }
        System.out.println("Hello normal user!");
        return checkNext(email, password);
    }
}
