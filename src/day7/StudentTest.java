package day7;

public class StudentTest {
    public static void main(String[] args) {
        // 1. 객체 생성
        Student s1 = new Student("지은", 20240605);
        Student s2 = new Student("상톨", 19931122);

        // 2. 성적입력
        s1.setScores(30, 90, 50); // 초기 상태 확인 -> 차량 : 현대 소나타, 속도 0km/h
        s2.setScores(90, 94,85); // 현대 소나타, 현재 속도 60km/h

        System.out.println(" ");

        // 3.  성적표 출력
        s1.printReport();
        s2.printReport();
    }
}
