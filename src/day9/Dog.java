package day9;

public class Dog extends Animal{
    private String breed;

    // 생성자
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // 메서드 오버라이딩
    @Override
    public void speak() {
        System.out.println(name + ": 멍멍!");
    }

    @Override
    public void showInfo() {
        super.showInfo(); // 부모 메서드 호출
        System.out.println("견종 " + breed);
    }

    // Dog만의 메서드
    public void fetch() {
        System.out.println(name + "이/가 공을 물어옵니다.");
    }
}
