package day10;

public class MobilePayment extends Payment {
    private String phoneNumber;

    public MobilePayment(int amount, String phoneNumber) {
        super(amount);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean process() {
        System.out.println("모바일 결제");
        System.out.println("전화번호: " + phoneNumber);
        System.out.println(String.format("%,d", amount) + "원 결제 완료!");
        return true;
    }
}
