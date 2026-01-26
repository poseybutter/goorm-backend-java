package day7;

public class Person {
    // 1. 필드 (속성)
    String name;
    int age;
    String job;

    // 2. 생성자 (오버로딩)
    // 기본 생성자
    public Person () {
    }

    // 매개변수 2개 생성자
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 매개변수 3개 생성자
    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    // 3. 메서드
    // 자기소개 (매개변수 없음)
    public void introduce() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age + "살");
        if (job != null) {
            System.out.println("직업 : " + job);
        }
    }

    // 인사하기 (매개변수 있음)
    public void greet(String targetName) {
        System.out.println(name + "이(가) " + targetName + "에게 인사합니다.");
    }

}
