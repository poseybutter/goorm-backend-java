package day4;

public class Example1 {
    public static void main(String[] args) {
        int[] ary = {1, 2, 3, 4, 5};
        int end = ary.length;
        int start = 0;

        for (int i = 0; i < end; i++) {
            // 1. i라는 변수에 int형 데이터 숫자 0으로 초기화를 해준다.
            // 2. i < 4 조건문을 실행한다.
            // 3. 2번의 조건문이 true일 경우, 중괄호를 감싸고 있는 코드 블록이 실행이 된다.
            // 4. i++ 증감 연산자를 통해서 첫 번째에서 초기화 했던 변수 i의 값에 +1 해줌 --> i의 0 + 1이 되면서 1로 바뀌게 됨
            // 5. 다시 2번으로 돌아가서 조건문을 확인하고 실행여부를 판단하고, 증감 연산자를 실행 (루프)
            System.out.println("i: " + i); // output: 0,1,2,3,4
        }
        System.out.println("\n");
        for (int i = 5; i > start; i--) {
            System.out.println("i: " + i); // output: 5, 4, 3, 2, 1

            // 증감 연산자라는 것을 사용하고 있다.
            // 증감 연산자에는 기호가 앞에 오냐 뒤에 오냐에 따라서 전위 증감자, 후위 증감자로 나뉨 -> 독립적으로 사용하면 결과는 동일하다.
            // 다만, 다른 연산자와 함께 쓰이면 전위와 후위는 다르게 동작한다.
        }
    }
}
