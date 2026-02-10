package day12;

public class GradeManagement {
    public static void main(String[] args) {
        StudentGrade student = new StudentGrade("홍길동");

        try {
            student.setScore(0, 85);
            student.setScore(1, 90);
            student.setScore(2, 150);  // 예외 발생!
        } catch (InvalidScoreException e) {
            System.out.println("성적 입력 오류: " + e.getMessage());
        }

        student.printReport();
    }
}
