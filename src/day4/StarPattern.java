package day4;

public class StarPattern {
    public static void main(String[] args) {
        int n = 5;

        // 직각삼각형
        System.out.println("=== 직각삼각형 ===");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 역삼각형
        System.out.println("\n=== 역삼각형 ===");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 피라미드
        System.out.println("\n=== 피라미드 ===");
        for (int i = 1; i <= n; i++) {
            // 공백 출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
