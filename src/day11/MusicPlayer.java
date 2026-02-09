package day11;

public class MusicPlayer implements Playable, VolumeControllable {
    private String currentSong;
    private int volume = 50;
    private boolean isPlaying = false;

    public MusicPlayer(String song) {
        this.currentSong = song;
    }

    @Override
    public void play() {
        isPlaying = true;
        System.out.println("재생: " + currentSong);
        showStatus("재생 중");
    }

    @Override
    public void pause() {
        isPlaying = false;
        System.out.println("일시정지");
        showStatus("일시정지");
    }

    @Override
    public void stop() {
        isPlaying = false;
        System.out.println("정지");
        showStatus("정지됨");
    }

    @Override
    public void volumeUp() {
        if (volume < 100) {
            volume += 10;
        }
        System.out.println("볼륨: " + volume);
    }

    @Override
    public void volumeDown() {
        if (volume > 0) {
            volume -= 10;
        }
        System.out.println("볼륨: " + volume);
    }

    @Override
    public int getVolume() {
        return volume;
    }

    public void changeSong(String song) {
        this.currentSong = song;
        System.out.println("곡 변경: " + currentSong);
    }

}
