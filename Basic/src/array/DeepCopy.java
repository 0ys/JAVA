package array;
// 객체 배열의 깊은 복사
public class DeepCopy {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("세븐 랭귀지", "브루스 테이트");
        bookArray1[1] = new Book("오브젝트", "조영호");
        bookArray1[2] = new Book("클린 코드", "로버트 마틴");

        bookArray2[0] = new Book(); // 디폴트 생성자로 배열2의 인스턴스 생성
        bookArray2[1] = new Book();
        bookArray2[2] = new Book();

        for(int i=0; i<bookArray1.length; i++){   // Deep Copy
            bookArray2[i].setBookName(bookArray1[i].getBookName());
            bookArray2[i].setAuthor(bookArray1[i].getAuthor());
        }

        for(int i=0; i<bookArray2.length; i++){
            bookArray2[i].showBookInfo();
        }

        bookArray1[0].setBookName("세븐 데이터베이스");   //bookArray1의 요소 값 수정
        bookArray1[0].setAuthor("에릭 레드몬드");

        System.out.println("=== bookArray1 ===");    //bookArray1 출력
        for(int i=0; i<bookArray1.length; i++){
            bookArray1[i].showBookInfo();
        }

        System.out.println("=== bookArray2 ===");    //bookArray2 출력
        for(int i=0; i<bookArray2.length; i++){
            bookArray2[i].showBookInfo();   // bookArray1 배열 요소 값과 다른 내용이 출력됨
        }
    }
}
