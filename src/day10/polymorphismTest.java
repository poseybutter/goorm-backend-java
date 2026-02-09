package day10;

public class polymorphismTest {
    public static void main(String[] args) {
        // "다형성(Polymorphism)"이 코드에서 어떻게 동작하는지 확인하기
        //
        // 핵심 1) 업캐스팅(Upcasting)
        // - 부모 타입(Animal) 변수/배열에 자식 객체(Dog/Cat/Bird)를 담는 것
        // - 자식 -> 부모 방향이므로 보통 자동으로 변환된다.
        //
        // 핵심 2) 동적 바인딩(Dynamic Binding) = 런타임 다형성
        // - 변수 타입이 Animal이어도, 오버라이딩된 메서드(speak)는 "실제 객체 타입" 기준으로 실행된다.
        //   (Dog면 Dog.speak, Cat이면 Cat.speak ...)
        //
        // 핵심 3) 다운캐스팅(Downcasting) + instanceof
        // - 자식 클래스에만 있는 기능(fetch/scratch/fly)을 쓰고 싶으면:
        //   1) instanceof 로 실제 타입을 확인하고
        //   2) 해당 타입으로 강제 형변환(다운캐스팅)한 뒤 메서드를 호출한다.
        // - instanceof 없이 잘못 캐스팅하면 런타임에 ClassCastException이 난다.

        // 부모 타입 배열(Animal[]) 하나에 서로 다른 자식 객체들을 담는다 = 업캐스팅
        Animal[] animals = {
            new Dog("바둑이"),
            new Cat("나비"),
            new Bird("짹짹이"),
            new Dog("멍멍이")
        };

        System.out.println("=== 모든 동물 소리 내기 ===");
        for (Animal animal : animals) {
            // 여기서 animal 변수의 타입은 Animal.
            // 하지만 실제로 들어있는 객체는 Dog/Cat/Bird 중 하나라서,
            // 각 클래스가 오버라이딩한 speak()가 실행된다 (동적 바인딩).
            animal.speak();

            // 참고: 아래는 Animal에 정의된 메서드라서(= 공통 기능) 그대로 호출 가능
            // animal.eat();
            // animal.showInfo();
        }

        System.out.println("\n=== 타입별 특수 행동 ===");
        for (Animal animal : animals) {
            // 공통 정보 출력(부모에 정의된 메서드)
            animal.showInfo();

            // 자식 전용 기능은 Animal 타입만으로는 "컴파일 단계"에서 보이지 않는다.
            // 예) animal.fetch();  // 컴파일 에러: Animal에는 fetch()가 없음
            //
            // 그래서 실제 타입을 확인하고, 맞는 타입으로 캐스팅해서 호출한다.
            if (animal instanceof Dog) { // 너 혹시 강아지니?
                Dog dog = (Dog) animal; // Animal -> Dog (다운캐스팅)
                dog.fetch();
            } else if (animal instanceof Cat) { // 너 고양이니?
                Cat cat = (Cat) animal; // Animal -> Cat
                cat.scratch();
            } else if (animal instanceof Bird) { // 너 새니?
                Bird bird = (Bird) animal; // Animal -> Bird
                bird.fly();
            }

            System.out.println("---");
        }

        // 정리:
        // - 공통 동작(모든 동물이 '울기' 같은 것)은 부모(Animal)에 메서드를 두고 오버라이딩으로 해결하면 if/else가 줄어든다.
        // - 특정 타입만 가능한 동작(강아지 fetch 등)은 타입 체크 + 다운캐스팅이 필요하거나,
        //   설계를 바꿔서(인터페이스/추상화) if/else를 줄이는 방법을 고민할 수 있다.
    }
}
