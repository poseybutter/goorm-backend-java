package jungseok.Chapter14;

@FunctionalInterface
interface MyFunction { // 함수형 인터페이스 MyFunction을 정의
    void run(); // public abstract void run(); = 추상 메서드
}
class LambdaEx {
    static void execute (MyFunction f) { // 매개변수의 타입이 MyFunction인 메서드
        f.run();
    }

    static MyFunction getMyfunction () { // 반환 타입이 MyFunction인 메서드
        MyFunction f = () -> System.out.println("f3.run()"); // 람다식을 매개변수로 저장
        return f;
    }

    public static void main(String[] args) {
        // 람다식으로 MyFunction의 run()을 구현
        MyFunction f1 = () -> System.out.println("f1.run()");
        MyFunction f2 = new MyFunction() { // 익명 클래스로 run()을 구현
            @Override
            public void run() { // public을 반드시 붙여야 함
                System.out.println("f2.run()");
            }
        }; // ✅ 익명 클래스 = 반드시 };
        MyFunction f3 = getMyfunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);;
        execute(() -> System.out.println("run()"));
    };
}
