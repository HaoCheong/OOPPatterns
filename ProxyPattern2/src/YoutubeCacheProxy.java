import java.util.HashMap;

public class YoutubeCacheProxy implements ThirdPartyYoutubeLib{

    //This is the Proxy class
    //Wraps around the original class
    //Will execute a check in the cache prior to access, reducing accessing latency

    private ThirdPartyYoutubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    public YoutubeCacheProxy() {
        this.youtubeService = new ThirdPartyYoutubeClass(); //Doing the wrapping of the original class
    }

    //Will cache popular videos, only call .popularVideos() once initially
    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular  = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache");
        }
        return cachePopular;
    }

    //Get a video but will check the cache prior to getting it via the original class
    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video " + videoId + " from cache");
        }
        return video;
    }

    //Resets the cache
    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
