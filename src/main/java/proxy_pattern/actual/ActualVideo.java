package proxy_pattern.actual;

import proxy_pattern.common.Video;

public class ActualVideo implements Video {
    private String path;

    /**
     * Will call download method to connect with the server
     *
     * @param path Url to the video
     */
    public ActualVideo(String path) {
        this.path = path;
        this.downLoadVideo();
    }

    /**
     * This method used to download video from the server
     * In here proxy server will contain the video
     */
    public void downLoadVideo() {
        System.out.println("Downloading..." + path);
    }

    /**
     * Will display the video
     */
    @Override
    public void display() {
        System.out.println("This is the video from real server" + path);
    }
}
