package day8;

// 완전한 캡슐화 클래스 예시
public class BankAccount {
    // 1. 모든 필드는 private
    private String accountNumber; // 계좌번호 (읽기 전용)
    private String owner; // 소유자 (읽기 전용)
    private int balance; // 잔액 (비즈니스 메서드로만 변경)
    private boolean active; // 활성 상태

    // 2. 생성자로 필수 값 초기화
    public BankAccount(String accountNumber, String owner) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = 0;
        this.active = true;
    }

    // 3. Getter: 필요한 것만 제공
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getOwner() {
        return owner;
    }
    public int getBalance() {
        return balance;
    }
    public boolean isActive() {
        return active;
    }

    // 4. Setter: 꼭 필요한 것만, 검증 포함
    // accountNumber, owner -> Setter 없음 (변경 불가)
    // balance -> Setter 없음 (입금/출금으로만 변경)

    public void SetActive(boolean active) {
        this.active = active;
        System.out.println("계좌 상태 : " + (active ? "활성화" : "비활성화"));
    }

    // 5. 비즈니스 메서드: 핵심 기능
    public void deposit(int amount) {
        if (!active) {
            System.out.println("비활성화된 계좌입니다.");
            return;
        }
        if (amount <= 0) {
            System.out.println("입금액은 0보다 커야 합니다.");
            return;
        }
        balance += amount;
        System.out.println(amount + "원 입금. 잔액 : " + balance + "원");
    }

    public boolean withdraw(int amount) {
        if (!active) {
            System.out.println("비활성화된 계좌입니다.");
            return false;
        }
        if (amount <= 0) {
            System.out.println("출금액은 0보다 커야 합니다.");
            return false;
        }
        if (amount > balance) {
            System.out.println("잔액 부족. 현재 잔액 : " + balance + "원");
            return false;
        }
        balance -= amount;
        System.out.println(amount + "원 출금. 잔액 : " + balance + "원");
        return true;
    }

    public boolean transfer(BankAccount target, int amount) {
        if (this.withdraw(amount)) {
            target.deposit(amount);
            System.out.println(target.owner + " 계좌로 이체 완료");
            return true;
        }
        return false;
    }

    // 6. 정보 출력 메서드
    public void showInfo() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("계좌번호: " + accountNumber);
        System.out.println("소유자: " + owner);
        System.out.println("잔액: " + balance + "원");
        System.out.println("상태: " + (active ? "활성" : "비활성"));
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
}
