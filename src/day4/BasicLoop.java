package day4;

public class BasicLoop {
    public static void main(String[] args) {
        // 1부터 10까지 출력 (for)
        System.out.println("=== for문 (1~10) ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "");
        }

        // 10부터 1까지 출력 (while)
        System.out.println("\n\n=== while문 (10~1) ===");
        int j = 10;
        while (j >= 1) {
            System.out.println(j + "");
            j--;
        }

        // 1~100 합계 계산
        System.out.println("\n\n === 1~100 합계 ===");
        int sum = 0;
        for (int i = 1; i<= 100; i++) {
            sum += i; // sum = sum + i;
        }
        System.out.println("합계 : " + sum);

        // 짝수의 합
        System.out.println("\n=== 1~100 짝수의 합 ===");
        int evenSum = 0;
        for (int i = 2; i <= 100; i += 2) {
            evenSum += i;
        }
        System.out.println("짝수의 합 : " + evenSum);
    }
}
