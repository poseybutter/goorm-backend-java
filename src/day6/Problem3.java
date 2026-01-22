package day6;

public class Problem3 {
    public static void main(String[] args) {
        int n = 5;

        if (n > 3 || ++n > 10) { // true || false -> or은 둘 중 하나 true면 true
            System.out.println("조건 만족"); // 출력됨
        }
        System.out.println("n = " + n); // 5

        int m = 5;

        if (m < 3 || ++m > 10) { // false || false -> false
            System.out.println("조건 만족"); // 출력 ❌
        }
        System.out.println("m = " + m); // 6
    }
}

