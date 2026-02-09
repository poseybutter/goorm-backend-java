package day9;

public class Developer extends Employee {
    private String language;

    public Developer(String name, int salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    public void work() {
        System.out.println(name + "이/가 " + language + "로 코딩합니다.");
    }

    public void debug() {
        System.out.println(name + "이/가 디버깅합니다.");
    }
}
