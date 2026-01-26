package day7;

public class BankAccount {
    // 1. 필드 (속성)
    String owner; // 소유자
    String accountNumber; // 계좌번호
    int balance; // 잔액

    // 2. 생성자 - 반드시 받아야 하는 값
    public BankAccount(String owner, String accountNumber) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = 0; // 초기 잔액 0원
    }

    // 3. 메서드
    // 입금
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원 입금. 잔액 : " + balance + "원");
        }
    }
    // 출금
    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("잔액 부족! 현재 잔액 " + balance + "원");
        } else {
            balance -= amount;
            System.out.println(amount + "원 출금. 잔액: " + balance + "원");
        }
    }

    // 이체 (다른 계좌 객체로)
    public void transfer(BankAccount target, int amount) {
        if (amount > balance) {
            System.out.println("잔액 부족으로 이체 실패");
        } else {
            this.balance -= amount;
            target.balance += amount;
            System.out.println(target.owner + "에게 " + amount + "원 이체 완료");
        }
    }

    // 계좌 정보 출력
    public void showInfo() {
        System.out.println("계좌 : " + accountNumber + " | 소유자 : " + owner + " | 잔액 : " + balance + "원");
    }
}
