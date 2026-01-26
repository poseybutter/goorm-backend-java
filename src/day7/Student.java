package day7;

public class Student {
    // 1. 필드
    String name; // 이름
    int studentId; // 학번
    int[] scores; // 성적 배열(3과목)

    // 2. 생성자
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.scores = new int[3]; // 3과목 배열 생성
    }

    // 3. 메서드
    // 성적 입력
    public void setScores(int korean, int english, int math) {
        scores[0] = korean;
        scores[1] = english;
        scores[2] = math;
    }

    // 총점 계산
    public int getTotal() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum;
    }

    // 평균 계산
    public double getAverage() {
        return (double) getTotal() / scores.length;
    }

    // 성적표 출력
    public void printReport() {
        System.out.println("=== 성적표 ===");
        System.out.println("학번 : " + studentId);
        System.out.println("이름 : " + name);
        System.out.println("국어 : " + scores[0] + ", 영어 : " + scores[1] + ", 수학 : " + scores[2]);
        System.out.println("총점 : " + getTotal() + ", 평균 : " + String.format("%.1f", getAverage()));
    }
}
