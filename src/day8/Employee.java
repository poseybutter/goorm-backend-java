package day8;

// 읽기 전용 / 쓰기 전용 필드
public class Employee {
    private String employeeId; // 사번: 읽기 전용 (생성 후 변경 불가)
    private String name;
    private int salary; // 급여: 특수 메서드로만 변경

    // 생성자에서만 사번 설정
    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = 0;
    }

    // 읽기 전용: Getter만 제공, Setter 없음
    public String getEmployeeId() {
        return employeeId;
    }
    // setEmployeeId() 없음 -> 수정 불가

    // 일반: Getter + Setter 모두 제공
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 비즈니스 로직을 통한 변경: Getter만, 직접 Setter 없음
    public int getSalary() {
        return salary;
    }

    // Setter 대신 비즈니스 메서드 제공
    public void raiseSalary(int amount) {
        if(amount < 0) {
            this.salary += amount;
            System.out.println("급여가 " + amount + "원 인상되없습니다.");
        }
    }
}
