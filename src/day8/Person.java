package day8;

// 회원 관리 : 유효성 검사 (Validation)
// Setter에서 유효성 검사를 통해 잘못된 데이터 입력을 방지
public class Person {
    private String name;
    private String id;
    private String password; // 필수, 변경 가능 (특수 메서드)
    private int age;
    private String email;
    private String phone;

    // 생성자
    public Person(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    // getter (password는 보안상 getter 없음)
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    // 이름 검증: null 또는 빈 문자열을 방지
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("이름을 입력해주세요.");
            return;
        }
        this.name = name;
    }

    // 나이 검증: 범위 체크
    public void setAge(int age) {
        if (age < 0 ){
            System.out.println("나이는 0 이상이어야 합니다.");
            return;
        }
        if (age > 150) {
            System.out.println("나이는 150 이하여야 합니다.");
            return;
        }
        this.age = age;
    }

    // 이메일 검증: 형식 체크
    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            System.out.println("올바른 이메일 형식이 아닙니다.");
            return;
        }
        this.email = email;
        System.out.println("이메일이 등록되었습니다: " + email);
    }

    // 전화번호 검증: 숫자와 하이픈만 허용
    public void setPhone(String phone) {
        if(phone == null) {
            System.out.println("전화번호를 입력해주세요.");
            return;
        }
        // 숫자와 하이픈만 허용
        if (!phone.matches("[0-9-]+")) {
            System.out.println("전화번호는 숫자와 하이픈만 입력 가능합니다.");
            return;
        }
        this.phone = phone;
    }

    // 비밀번호는 특수 메서드로만 변경 (검증 포함)
    public boolean changePassword(String oldPw, String newPw) {
        // 현재 비밀번호 확인
        if (!this.password.equals(oldPw)) {
            System.out.println("현재 비밀번호가 일치하지 않습니다.");
            return false;
        }
        // 새 비밀번호 유효성 검사
        if (newPw == null || newPw.length() < 4) {
            System.out.println("새 비밀번호는 4자 이상이어야 합니다.");
            return false;
        }
        this.password = newPw;
        System.out.println("비밀번호가 변경되었습니다.");
        return true;
    }

    // 로그인 검증
    public boolean login(String inputPw) {
        if(this.password.equals(inputPw)) {
            System.out.println(name + "님, 로그인 성공!");
            return true;
        }
        System.out.println("비밀번호가 일치하지 않습니다.");
        return false;
    }

    // 프로필 출력
    public void showProfile() {
        System.out.println("=== 회원 정보 ===");
        System.out.println("ID: " + id);
        System.out.println("이름: " + name);
        System.out.println("이메일: " + (email != null ? email : "미등록"));
    }
}
