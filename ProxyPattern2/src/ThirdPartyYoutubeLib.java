import java.util.HashMap;

public interface ThirdPartyYoutubeLib {

    //Library Class
    //Interface of methods which the original class and proxy class can perform

    HashMap<String, Video> popularVideos();
    Video getVideo(String videoId);
}
