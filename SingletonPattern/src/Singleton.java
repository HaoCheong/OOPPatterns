public class Singleton {
    
    //Singleton class

    private static Singleton instance; //Instance of the class is static
    private String legalName; //Contents are remains private

    //Private constructor to prevent direct creation
    private Singleton(String name) {
        legalName = name;
    }

    //Static public function, will create a new instance if calling for the first time, will return original instance otherwise
    public static Singleton getInstance(String name) { 
        if (instance == null) {
            instance = new Singleton(name);
        }
        return instance; 
    }

    public String getLegalName() {
        return this.legalName;
    }
}
