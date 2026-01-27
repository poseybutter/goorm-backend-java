package day8;

// 다양한 유효성 검사 패턴
public class Product {
    private String name;
    private int price;
    private int stock;
    private String category;

    // 생성자
    public Product(String name, int price, int stock) {
        this.name = name;
        setPrice(price); // 유효성 검사 적용
        setStock(stock); // 유효성 검사 적용
    }

    // getter
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }

    // 패턴 1: 범위 검사
    public void setPrice(int price) {
        if(price < 0) {
            System.out.println("가격은 0 이상이어야 합니다.");
            return;
            //  throw new IllegalArgumentException("가격은 0 이상이어야 합니다.");
            // 지금 값 이상하니까 프로그램 멈추고 에러 던질게 라는 뜻
            // throw는 예외를 직접 발생시키는 키워드
            // IllegalArgumentException은 메서드에 넘긴 매개변수 값이 잘못됐다는 뜻의 예외
        }
        if (price > 10000000) {
            throw new IllegalArgumentException("가격이 너무 높습니다.");
        }
        this.price = price;
    }

    // 패턴 2: 최솟값 보정
    public void setStock(int stock) {
        // 음수면 0으로 보정
        if(stock < 0) {
            System.out.println("재고는 0 이상이어야 합니다.");
            return;
        }
        this.stock = stock;
    }

    // 패턴 3: 허용 목록 검사
    public void setCategory(String category) {
        String[] validCategories = {"전자제품", "의류", "식품", "도서"};

        for (String valid : validCategories) {
            this.category = category;
            return;
        }
        System.out.println("유효하지 않은 카테고리입니다.");
    }

    // 패턴 4: 문자열 정규화 (앞뒤 공백 제거)
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("상품명을 입력해주세요.");
            return;
        }
        this.name = name.trim(); // 공백 제거 후 저장
    }

    // 비즈니스 메서드
    public boolean sell(int quantity) {
        if (quantity <= 0) {
            System.out.println("판매 수량은 1 이상이어야 합니다.");
            return false;
        }
        if (quantity > stock) {
            System.out.println("재고 부족! 현재 재고: " + stock);
            return false;
        }
        stock -= quantity;
        System.out.println(name + " " + quantity + "개 판매. 남은 재고: " + stock);
        return true;
    }

    public void restock(int quantity) {
        if (quantity <= 0) {
            System.out.println("입고 수량은 1 이상이어야 합니다.");
            return;
        }
        stock += quantity;
        System.out.println(name + " " + quantity + "개 입고. 현재 재고: " + stock);
    }

    public void showInfo() {
        System.out.println("[" + name + "] 가격: " + price + "원, 재고: " + stock + "개");
    }
}
