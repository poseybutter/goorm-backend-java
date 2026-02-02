package day9;

public class Animal {
    protected String name;
    protected int age;

    // 생성자
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // 메서드
    public void eat() {
        System.out.println(name + "이/가 먹습니다.");
    }
    public void sleep() {
        System.out.println(name + "이/가 잠을 잡니다.");
    }
    public void speak() {
        System.out.println(name + "이/가 소리를 냅니다.");
    }
    public void showInfo() {
        System.out.println("이름 : " + name + ", 나이 : " + age + "살");
    }
}