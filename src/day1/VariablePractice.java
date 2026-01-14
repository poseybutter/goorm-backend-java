package day1;

public class VariablePractice {
    public static void main(String[] args) {
        String name = "Lee posey";
        int age = 31;
        double height = 170.8;
        boolean isStudent = false;
        // 논리 타입에 대한 값을 저장하는 변수 이름
        // isStudent?
        // hasValue?
        // isSuccess?
        char grade = 'A';

        System.out.println("=== 학생 정보 ==="); // 출력만 하는 출력 메서드
        System.out.println("이름: " + name); // 출력 후 줄바꿈 출력 메서드
        System.out.println("나이: " + age); // 출력 후 줄바꿈 출력 메서드
        System.out.println("키: " + height); // 출력 후 줄바꿈 출력 메서드
        System.out.println("학생 여부: " + isStudent); // 출력 후 줄바꿈 출력 메서드
        System.out.println("학점: " + grade); // 출력 후 줄바꿈 출력 메서드

        if (true) {
            System.out.println("ㅁㅔ롱");
        }

        // equals는 대소문자를 구분합니다.
        if("String".equalsIgnoreCase("string")) {
            System.out.println("true");
        }

        boolean isLogging = true;

        // 2가지 조건이 있어서,
        // 1조건이 true일 때, 실행될 코드

        if(isLogging) {
            System.out.println("어서오세요. 고객님!");
        } else {
            System.out.println("로그인 해주세요!");
        }

    }
}
