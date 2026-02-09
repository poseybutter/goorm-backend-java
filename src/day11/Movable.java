package day11;

// 이동 가능 인터페이스
public interface Movable {
    void move(int x, int y);
    void stop();

    default void printPosition() {
        System.out.println("위치 정보를 출력합니다.");
    }
}
