package adapter;

public class VideoPlayer extends PlayerAdapter{
    public VideoPlayer() {
        setType("Video");
    }

    @Override
    public void play() {
        System.out.println("Video is start playing ...");
    }
}
