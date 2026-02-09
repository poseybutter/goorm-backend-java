package day9;

public class Shape {
    protected String color;

    public Shape (String color) {
        this.color = color;
    }

    public double getArea() {
        return 0;
    }
    public void showInfo() {
        System.out.printf("색상: %s, 넓이: %.2f%n", color, getArea());
    }
}
