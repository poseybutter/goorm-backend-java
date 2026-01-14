package day2;

public class ConditionCheck {
    public static void main(String[] args) {
        int age = 31;
        int score = 90;

        // 비교 연산
        System.out.println("=== 비교 연산 ===");
        System.out.println("성인 여부 (age >= 18): " + (age >= 18)); // true
        System.out.println("합격 여부 (score >= 60): " + (score >= 60)); // true

        // 논리 연산
        System.out.println("\n=== 논리 연산 ===");
        boolean canApply = (age >= 20) && (score >= 70); // true
        System.out.println("지원 가능 (20세 이상 And 70점 이상)");

        boolean getDiscount = (age < 20) || (age >= 65); // false
        System.out.println("할인 대상 (20세 미만 OR 65세 이상)");

        // 삼항 연산자
        System.out.println("\n=== 삼항 연산자 ===");
        String result = (score >= 60) ? "합격" : "불합격"; // 합격
        System.out.println("결과: " + result); // 결과: 합격

        // 중첩 삼항 연산자 (학점 계산)
        char grade = (score >= 90) ? 'A' :
                     (score >= 80) ? 'B' :
                     (score >= 70) ? 'C' :
                     (score >= 60) ? 'D' : 'F';
        System.out.println("학점: " + grade); // 학점: A

    }
}
