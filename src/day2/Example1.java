package day2;

public class Example1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        System.out.println("a + b = " + (a + b));
        // 덧셈 기호는 쌍따옴표와 함께 쓰이면 우선적으로 문자열 합치기로 연산을 하도록 설정이 되어 있습니다.
        // a + b 연산 결과를 먼저 구할 수 있도록 소괄호를 한번 더 감싸줘야 한다.

        int x = 0;
        int y = 10;

        System.out.println("x % y = " + (x % y));

        int num = 12345;
        System.out.println("1의 자리 : " + (num & 10)); // 12345 / 10 = 몫과 나머지가 어떻게 나오는지 계산
        System.out.println("10의 자리 : " + ((num & 10) % 10));
        System.out.println("100의 자리 : " + ((num & 100) % 10));
        System.out.println("1000의 자리 : " + ((num & 1000) % 10));
        System.out.println("10000의 자리 : " + ((num & 10000) % 10));
        // for - while

        String age = "20";
        System.out.println("Happy New Year ::" + (age + 1));
        System.out.println(x + y + "= x + y");

        int x1 = 0; // -21억 ~ + 21억; 2147483647
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(max + 1);
        System.out.println(min);
    }
}
