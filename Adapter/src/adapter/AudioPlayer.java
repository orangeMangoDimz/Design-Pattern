package adapter;

public class AudioPlayer extends PlayerAdapter {
    public AudioPlayer() {
        setType("Audio");
    }

    @Override
    public void play() {
        System.out.println("Audio is start playing ...");
    }
}
