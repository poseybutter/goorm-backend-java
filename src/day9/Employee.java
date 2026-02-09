package day9;

public class Employee {
    protected String name;
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;

    }
    public void work() {
        System.out.println(name + "이/가 일합니다.");
    }

    public int getSalary() {
        return salary;
    }

    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("급여 : " + String.format("%,d", getSalary()) + "원");
    }
}
