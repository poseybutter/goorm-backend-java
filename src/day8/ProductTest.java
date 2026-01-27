package day8;

public class ProductTest {
    public static void main(String[] args) {
        // 객체 생성
        Product laptop = new Product("노트북", 150000, 10);
        Product mouse = new Product("마우스", 35000, 50);

        // 정보 출력
        laptop.showInfo();
        mouse.showInfo();

        // 판매 테스트
        System.out.println("\n=== 판매 ===");
        laptop.sell(3); // 남은 재고 : 7
        mouse.sell(10); // 남은 재고 : 40

        // 입고 테스트
        System.out.println("\n=== 입고 ===");
        laptop.restock(5); // 5개 입고. 현재 재고 : 12

        // 유효성 검사 테스트
        System.out.println("\n=== 유효성 검사 ===");
        laptop.setPrice(-1000); // 실패
        laptop.sell(100); // 실패 (재고 부족)

    }
}
