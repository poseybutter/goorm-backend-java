package day10;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public void printInfo() {
        System.out.println("도형: " + name);
        System.out.printf("면적: %.2f%n", getArea());
        System.out.printf("둘레: %.2f%n", getPerimeter());
    }
}
