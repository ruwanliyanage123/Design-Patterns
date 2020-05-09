package proxy_pattern.proxy;

import proxy_pattern.actual.ActualVideo;
import proxy_pattern.common.Video;

public class ProxyVideo implements Video {
    private String path;
    private ActualVideo actualVideo;

    public ProxyVideo(String path) {
        this.path = path;
    }

    /**
     * This method first will check about if there have actual video
     * if not that, will take video from actual server to proxy server
     * and display it.
     */
    @Override
    public void display() {
        if (actualVideo == null) {
            actualVideo = new ActualVideo(path);
            actualVideo.display();
        } else {
            System.out.println("This is the video from proxy server" + path);
        }
    }
}
