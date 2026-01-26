package day7;

public class Car {
    // 1. 필드 (속성)
    String brand; // 브랜드
    String model; // 모델명
    int speed; // 현재 속도

    // 2. 생성자
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0; // 초기 속도는 0
    }

    // 3. 메서드
    // 가속
    public void accelerate(int amount) {
        speed += amount;
        System.out.println(brand + " " + model + " : 가속! 현재 속도 " + speed + "km/h" );
    }

    // 감속 (0 이하로 내려가지 않도록 처리)
    public void brake(int amount) {
        speed -= amount;
        if (speed < 0) speed = 0;
        System.out.println(brand + " " + model + " : 감속 ! 현재 속도 " + speed + "km/h");
    }

    // 차량 정보 출력
    public void info() {
        System.out.println("차량 : " + brand + " " + model + ", 속도 : " + speed + "km/h");
    }

}
