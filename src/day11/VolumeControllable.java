package day11;

public interface VolumeControllable {
    void volumeUp();
    void volumeDown();
    int getVolume();
    
    default void mute() {
        System.out.println("음소거");
    }
}
