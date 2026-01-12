package day1;

public class TypeCasting {
    public static void main(String[] args) {
        // ===== 자동 형변환 (Widening Casting) =====
        System.out.println(" === 자동 형변환 ===");

        int intNum = 100;
        long longNum = intNum;  // int > long
        float floatNum = longNum;   // long > float
        double doubleNum = floatNum;    // float > double

        System.out.println("int: " + intNum);
        System.out.println("long: " + longNum);
        System.out.println("float: " + floatNum);
        System.out.println("double: " + doubleNum);

        // ===== 강제 형변환 (Narrowing Casting) =====
        System.out.println("\n=== 강제 형변환 ===");

        double pi = 3.14159;
        int intPi = (int) pi; // 소수점 버림

        System.out.println("double pi: " + pi);
        System.out.println("int pi: " + intPi);

        int bigNumber = 1000;
        byte smallNumber = (byte) bigNumber;  // 오버플로우 !
        System.out.println("int: " + bigNumber);
        System.out.println("byte: " + smallNumber);  // -24

        // ===== char와 int 변환 =====
        System.out.println("\n=== char와 int 변환 ===");
        char ch = 'A';
        int ascii = ch;     // char -> int (ASCII 코드)
        System.out.println("'A'의 ASCII: " + ascii);  // 65

        int code = 66;
        char letter = (char) code;  // int -> char
        System.out.println("66의 문자: " + letter);    // b

    }
}
