public class App {
    
    //SINGLETON PATTERN

    //Primary use of this pattern is to only create a single instance of an object
    //Used when the object/class in question that is created uses a large number of computer resources
    //Prevent unnecessary creation of multiple resource heavy objects

    public static void main(String[] args) throws Exception {
        System.out.println("-------- Legal Names --------");

        Singleton single = Singleton.getInstance("Soma");
        System.out.println("Original Legal Name: " + single.getLegalName());

        System.out.println("Changing name...");
        single = Singleton.getInstance("Takumi");
        System.out.println("Original Legal Name: " + single.getLegalName());
    }
}
