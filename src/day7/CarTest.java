package day7;

public class CarTest {
    public static void main(String[] args) {
        // 1. 객체 생성
        Car myCar = new Car("현대", "소나타");
        Car yourCar = new Car("기아", "K5");

        // 2. myCar 테스트
        myCar.info(); // 초기 상태 확인 -> 차량 : 현대 소나타, 속도 0km/h
        myCar.accelerate(50); // 현대 소나타, 현재 속도 50km/h
        myCar.accelerate(30); // 현대 소나타, 현재 속도 80km/h
        myCar.brake(20); // 현대 소나타, 현재 속도 60km/h

        System.out.println();

        // 3. yourCar 테스트
        yourCar.accelerate(100); // 차량 : 기아 K5, 현재 속도 100km/h
        yourCar.info(); // 차량 : 기아 K5, 속도 100km/h
    }

}
