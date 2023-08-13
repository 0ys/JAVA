package arraylist;
import java.util.ArrayList;

public class Customer {
    int customerID;
    String customerName;
    ArrayList<Book> bookList;

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        bookList = new ArrayList<Book>();
    }

    public void addBook(String bookName, String author) {
        Book book = new Book();
        book.setBookName(bookName);
        book.setAuthor(author);
        bookList.add(book);
    }

    public void showCustomerInfo() {
        int total = 0;
        System.out.println("손님 "+customerName+"이(가) 빌린 책은 아래와 같습니다.");
        for(Book b : bookList) {
            total += 1;
            System.out.println("    - "+b.getBookName()+", "+b.getAuthor());
        }
        System.out.println("손님 "+customerName+"이(가) 빌린 총 책은 "+total+"권 입니다.");
    }
}
