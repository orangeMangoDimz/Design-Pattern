package main;

import adapter.AudioPlayer;
import adapter.PlayerAdapter;
import adapter.VideoPlayer;
import model.Player;

public class Main {
    public static void main(String[] args) {
        PlayerAdapter playerAdapter = new AudioPlayer();
        playerAdapter.play();

        playerAdapter = new VideoPlayer();
        playerAdapter.play();
    }
}
