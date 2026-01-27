package day8;

public class Circle {
    // 상수와 필드
    private double radius;
    private static final double PI = 3.141592; // 상수는 public 가능

    // 생성자
    public Circle() {
        this.radius = 1.0; // 기본 반지름
    }
    public Circle(double radius) {
        setRadius(radius); // 유효성 검사 적용
    }

    // Getter (필드값 반환)
    public double getRadius() {
        return radius;
    }

    // Setter with validation (필드 값 설정 + 검증)
    public void setRadius(double radius) {
        if (radius <= 0) {
            System.out.println("반지름은 0보다 커야 합니다.");
            this.radius = 1.0; // 기본값 설정
            return;
        }
        this.radius = radius;
    }

    // 계산 메서드
    public double getArea() {
        return PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }

    // 정보 출력
    public void showInfo() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("반지름: " + radius);
        System.out.println("넓이: " + String.format("%.2f", getArea()));
        System.out.println("둘레: " + String.format("%.2f", getCircumference()));
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━");
    }
}
