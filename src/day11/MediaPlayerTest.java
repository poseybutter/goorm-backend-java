package day11;

public class MediaPlayerTest {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer("Bohemian Rhapsody - Queen");

        System.out.println("=== 뮤직 플레이어 ===\n");

        player.play();
        player.volumeUp();
        player.volumeUp();

        System.out.println();
        player.pause();

        System.out.println();
        player.changeSong("Oh my girl - Dun Dun Dance");
        player.play();

        System.out.println();
        player.volumeDown();
        player.mute();

        System.out.println();
        player.stop();
    }
}
