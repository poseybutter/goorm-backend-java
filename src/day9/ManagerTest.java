package day9;

public class ManagerTest {
    public static void main(String[] args) {
        Manager manager = new Manager("홍길동", 3_000_000, 5);
        manager.work();
        manager.showInfo();
    }
}
