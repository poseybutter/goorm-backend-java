package day10;

public class CardPayment extends Payment {
    private String cardNumber;

    public CardPayment(int amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean process() {
        System.out.println("카드 결제");
        System.out.println("카드 번호: " + maskCardNumber());
        System.out.println(String.format("%,d", amount) + "원 결제 완료!");
        return true;
    };

    private String maskCardNumber() {
        return cardNumber.substring(0,4) + "-****-****-" +
                cardNumber.substring(cardNumber.length() - 4);
    }
}
