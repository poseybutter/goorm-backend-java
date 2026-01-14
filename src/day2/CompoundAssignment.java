package day2;

public class CompoundAssignment {
    public static void main(String[] args) {
        int x = 10;

        System.out.println("=== 복합 대입 연산자 ===");
        System.out.println("초기값 : " + x); // 초기값 : 10

        x += 5; // x = x + 5;
        System.out.println("x += 5: " + x); // 15

        x -= 3;  // x = x - 3
        System.out.println("x -= 3: " + x); // 12

        x *= 2;  // x = x * 2
        System.out.println("x *= 2: " + x); // 24

        x /= 4;  // x = x / 4
        System.out.println("x /= 4: " + x); // 6

        x %= 4;  // x = x % 4
        System.out.println("x %= 4: " + x); // 2

        // 문자열 연결
        System.out.println("\n=== 문자열 연결 ===");
        String message = "Hello";
        message += " "; // 띄어쓰기
        message += "World";
        message += "!";
        System.out.println(message);  // Hello World!
    }
}
