package day11;

public interface Playable {
    void play();
    void pause();
    void stop();

    default void showStatus(String status) {
        System.out.println("상태: " + status);
    }
}
