package day8;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("123", "자바의 정석", "남궁성", 15000);

        System.out.println(book.getPrice());

        book.borrow();
        book.returnBook();
        book.showInfo();
    }
}
