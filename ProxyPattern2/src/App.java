public class App {

    //PROXY PATTERN

    //This pattern provides a substitute/placeholder for another object
    //The proxy will in control the access to said original object
    //This allows the system to perform an action before or after execution
    //The proxy object acts as a "wrapper" around the initial object
    //This example shows using downloading videos from youtube, with and without a proxy
    
    public static void main(String[] args) throws Exception {
        System.out.println("-------- Youtube Downloader --------");
        YoutubeDownloader naiveDownloader = new YoutubeDownloader(new ThirdPartyYoutubeClass());
        YoutubeDownloader smartDownloader = new YoutubeDownloader(new YoutubeCacheProxy());

        System.out.println("<<<<< NAIVE TEST >>>>>");
        long naive = test(naiveDownloader);

        System.out.println("<<<<< SMART TEST >>>>>");
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");
    }

    private static long test(YoutubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
