package day10;

public class PaymentTest {
    public static void main(String[] args) {

        Payment[] payments = {
                new CardPayment(50000, "1234-5678-9012-3456"),
                new CashPayment(30000, 50000),
                new MobilePayment(15000, "010-1234-5678")
        };

        System.out.println("=== 결제 처리 시스템 ===\n");

        for (Payment payment : payments) {
            System.out.println("--- 결제 처리 ---");
            if (payment.process()) {
                payment.printReceipt();
            }
            System.out.println();
        }
    }
}
