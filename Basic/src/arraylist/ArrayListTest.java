package arraylist;
import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<Book>();

        library.add( new Book("세븐 랭귀지", "브루스 테이트") );
        library.add( new Book("세븐 데이터베이스", "에릭 레드몬드") );
        library.add( new Book("오브젝트", "조영호") );
        library.add( new Book("코드 CODE", "찰스 펫졸드") );
        library.add( new Book("클린 코드", "로버트 마틴") );

        for(int i=0; i<library.size(); i++){
            Book book = library.get(i);
            book.showBookInfo();
        }

        System.out.println();
        for(Book book : library){
            book.showBookInfo();
        }
    }
}
