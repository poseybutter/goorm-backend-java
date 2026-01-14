package day2;

public class ShoppingCalculator {
    public static void main(String[] args) {
        // 상품 정보
        int price = 15000; // 단가
        int quantity = 3; // 수량
        double discountRate = 0.1; // 할인율 10%

        // 계산
        int totalPrice = price * quantity; // 45000
        double discount = totalPrice * discountRate; // 45000 * 10% = 4500
        double finalPrice = totalPrice - discount; // 45000 - 4500 = 40500

        // 출력
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║         쇼핑 계산서               ║");
        System.out.println("╠════════════════════════════════╣");
        System.out.println("║ 단가:     " + price + "원");
        System.out.println("║ 수량:     " + quantity + "개");
        System.out.println("║ 합계:     " + totalPrice + "원");
        System.out.println("║ 할인:    -" + (int) discount + "원");
        System.out.println("╠════════════════════════════════╣");
        System.out.println("║ 최종금액: " + (int) finalPrice + "원");
        System.out.println("╚════════════════════════════════╝");

        // 무료 배송 여부 (3만원 이상)
        String shipping = (finalPrice >= 30000) ? "무료배송" : "배송비 3,000원"; // true
        System.out.println("\n배송: " + shipping); // 배송: 무료배송

        // 추가 할인 가능 여부
        boolean canExtraDiscount = (quantity >= 5) || (totalPrice >= 50000); // false || false => false
        System.out.println("추가 할인 가능: " + canExtraDiscount); // 추가 할인 가능: false
    }
}
