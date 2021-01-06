import java.util.HashMap;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {

    //Original class
    //This is the class in which the proxy class will wrap around
    //Contains all the methods of the library as it implements the library interface

    //Grabbing a random video
    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    //Grabbing a video based on ID
    @Override
    public Video getVideo(String videoId) {
        connectToServer("http://www.youtube.com/" + videoId);
        return getSomeVideo(videoId);
    }

    //Number randomiser for latency
    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    //Replicate network latency
    private void experienceNetworkLatency() {
        int randomLatency = random(5,10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    //Establish connection to a server
    private void connectToServer(String server) {
        System.out.print("Connecting to " + server + "... ");
        experienceNetworkLatency();
        System.out.print("Connected!" + "\n");
    }

    //Grabbing random hashmap of random videos
    private HashMap<String, Video> getRandomVideos() {
        System.out.print("Downloading populars...");
        HashMap<String, Video> hmap = new HashMap<String, Video>();
        hmap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        hmap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        hmap.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
        hmap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        hmap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));

        System.out.print("Done!" + "\n");
        return hmap;
    }

    //Get some video based on video id
    private Video getSomeVideo(String videoId) {
        System.out.print("Downloading video...");
        experienceNetworkLatency();
        Video video = new Video(videoId, "Some video title");
        System.out.print("Done!" + "\n");
        return video;
    }

}
