package day12;

// 테스트
public class CustomExceptionTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("홍길동", 10000);

        try {
            account.deposit(5000);
            account.withdraw(20000);  // 예외 발생
        } catch (InsufficientBalanceException e) {
            System.out.println("오류: " + e.getMessage());
            System.out.println("부족 금액: " + e.getShortage() + "원");
        } catch (IllegalArgumentException e) {
            System.out.println("오류: " + e.getMessage());
        }

        System.out.println("\n=== 나이 설정 ===");
        Member member = new Member();
        try {
            member.setAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }
}

