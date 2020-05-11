package proxy_pattern.driver;

import proxy_pattern.proxy.ProxyVideo;

public class VideoPlayer {
    /**
     * Main method to act as the driver for the proxy
     *
     * @param args command lines
     */
    public static void main(String[] args) {
        String path = "https://www.google.com/";
        ProxyVideo proxyVideo = new ProxyVideo(path);
        proxyVideo.display();
        proxyVideo.display();
    }
}
