package day9;

public class CircleShape extends Shape {
    private double radius;

    public CircleShape(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void showInfo() {
        System.out.println("=== 원 ===");
        System.out.println("반지름: " + radius);
        super.showInfo();
    }
}
