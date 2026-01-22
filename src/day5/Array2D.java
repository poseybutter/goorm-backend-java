package day5;

public class Array2D {
    public static void main(String[] args) {

        // 3명의 학생, 3개 과목 성적
        int[][] scores = {
                {85, 90, 78},  // 학생1
                {92, 88, 95},  // 학생2
                {76, 82, 80}   // 학생3
        };

        String[] subjects = {"국어", "영어", "수학"};
        String[] students = {"홍길동", "김영희", "이철수"};

        // 학생별 성적표
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║              학생별 성적표                ║");
        System.out.println("╠════════════════════════════════════════╣");

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            System.out.print("║ " + students[i] + ": ");

            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subjects[j] + " = " + scores[i][j] + " ");
                sum += scores[i][j];
            }

            double avg = (double) sum / scores[i].length;
            System.out.printf("│ 평균: %.1f%n", avg);
        }
        System.out.println("╚════════════════════════════════════════╝");

        // 과목별 평균
        System.out.println("\n=== 과목별 평균 ===");

        for (int j = 0; j < subjects.length; j++) {
            int sum = 0;
            for (int i = 0; i < scores.length; i++) {
                sum += scores[i][j];
            }
            double avg = (double) sum / scores.length;
            System.out.printf("%s: %.1f%n", subjects[j], avg);
        }
    }
}