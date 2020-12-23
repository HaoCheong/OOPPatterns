import java.io.File;

public class App {

    //FACADE PATTERN

    //This pattern is used when the features of a library (typically complex) are needed
    //However, it is unnecessary to access all the features
    //Some features are used to do a single task
    //To do so, a facade class is used which will call the necessary methods in the library and coallate it under one class
    //However, it could become a "god object" which could be undesirable

    //God Object: An object that is dependent by many other classes/objects

    public static void main(String[] args) throws Exception {
        System.out.println("-------- Converting Files --------");
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
