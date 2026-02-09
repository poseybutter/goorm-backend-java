package day9;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void showInfo() {
        System.out.println("=== 직사각형 ===");
        System.out.println("가로: " + width + ", 세로: " + height);
        super.showInfo();
    }
}
