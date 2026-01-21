package day4;

public class MultiplicationTable {
    public static void main(String[] args) {
        // 특정 단 출력
        int dan = 7;

        System.out.println("╔═══════════════════╗");
        System.out.println("║     " + dan + "단  ║");
        System.out.println("╠═══════════════════╣");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("║  %d × %d = %2d ║%n", dan, i, dan * i);;
        }
        System.out.println("╚═══════════════════╝");

        // 전체 구구단 (중첩 반복문)
        System.out.println("\n=== 전체 구구단 ===\n");

        for (int i = 2; i <= 9; i++) {              // 외부 반복문: 단(段) 선택
            System.out.println("[ " + i + "단 ]");   // 단 제목 출력

            for (int j = 1; j <= 9; j++) {          // 내부 반복문: 곱하는 수
                System.out.println(i + " × " + j + " = " + (i * j));
            }

            System.out.println();                    // 단 구분용 빈 줄
        }


    }
}
