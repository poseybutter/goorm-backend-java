package day12;

// 회원 클래스
class Member {
    private String name;
    private int age;

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("나이는 0~150 사이여야 합니다: " + age);
        }
        this.age = age;
    }
}