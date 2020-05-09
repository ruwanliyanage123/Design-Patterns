package proxy_pattern;

public class ProxyVideo implements Video {
    private String path;
    private ActualVideo actualVideo;

    public ProxyVideo(String path) {
        this.path = path;
        this.display(path);
    }

    /**
     * This method first will check about if there have actual video
     * if not that, will take video from actual server to proxy server
     * and display it.
     *
     * @param path Url to the video
     */
    @Override
    public void display(String path) {
        if (actualVideo == null) {
            actualVideo = new ActualVideo(path);
            actualVideo.display(path);
        } else {
            System.out.println("This is the video from proxy server" + path);
        }
    }
}
