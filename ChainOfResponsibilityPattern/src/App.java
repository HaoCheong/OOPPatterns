public class App {
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user1@example.com", "user_pass");

        Handler handler = new Throttling(2);
        handler.linkWith(new UserExist(server)).linkWith(new RoleCheck());
        server.setHandler(handler);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("------ Register and Login -------");
        init();
        boolean success = false;
        while (!success) {
            System.out.println("Entering email...");
            String email = "admin@example.com";

            System.out.println("Entering password...");
            String password = "admin_pass";
            success = server.login(email,password);
        }
        
    }
}
