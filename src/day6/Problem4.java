package day6;

public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int sum = 0;

        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) { // 짝수인지?
                continue; // 짝수는 건너뜀
            }
            sum += arr[i];
        }

        System.out.println("sum = " + sum);
    }
}
