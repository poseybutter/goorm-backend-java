package day1;

public class Constants {
    public static void main(String[] args) {
        // ===== 상수 선언 =====
        final double PI = 3.141592;
        final int MAX_STUDENTS = 30;
        final String SCHOOL_NAME = "코딩 부트캠프";

        System.out.println("학교: " + SCHOOL_NAME);
        System.out.println("MAX_STUDENTS: " + MAX_STUDENTS);

        // === 원의 넓이 계산 ===
        double radius = 5.0;
        double area = PI * radius * radius;

        System.out.println("\n반지름이 " + radius + "인 원의 넓이" + area);

        // PI = 3.14;  -> X 컴파일 에러~ 상수는 변경 불가함
    }
}