public class App {

    //COMMAND PATTERN

    //This pattern is used to separate commands into their own object which will contain all the information about the request
    //Allow to parameterise methods with different request or queue a request

    //This structure allows one to introduce new commands without breaking existing code

    public static void main(String[] args) throws Exception {
        System.out.println("-------- Text Copy and Paste --------");
        Editor editor = new Editor();
        editor.init();
    }
}
