package day9;

public class Manager extends Employee {
    private int teamSize;

    public Manager (String name, int salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println(name + "이/가 " + teamSize + "명의 팀을 관리합니다.");
    }

    @Override
    public int getSalary() {
        // 팀원 1명당 10만원 수당 추가
        return salary + (teamSize * 100000);
    }

}
