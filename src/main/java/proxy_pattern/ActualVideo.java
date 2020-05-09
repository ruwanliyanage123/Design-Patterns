package proxy_pattern;

public class ActualVideo implements Video {
    private String path;

    /**
     * Will call download method to connect with the server
     *
     * @param path Url to the video
     */
    public ActualVideo(String path) {
        this.path = path;
        this.downLoadVideo(path);
    }

    /**
     * This method used to download video from the server
     * In here proxy server will contain the video
     *
     * @param path Url to the video
     */
    public void downLoadVideo(String path) {
        System.out.println("Downloading..." + path);
    }

    /**
     * Will display the video
     *
     * @param path Url to the video
     */
    @Override
    public void display(String path) {
        System.out.println("This is the video from real server" + path);
    }
}
