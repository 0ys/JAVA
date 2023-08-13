package array;

public class BookArray {
    public static void main(String[] args) {
        Book[] library = new Book[5]; // 객체 배열 생성

        library[0] = new Book("세븐 랭귀지", "브루스 테이트");
        library[1] = new Book("세븐 데이터베이스", "에릭 레드몬드");
        library[2] = new Book("오브젝트", "조영호");
        library[3] = new Book("코드 CODE", "찰스 펫졸드");
        library[4] = new Book("클린 코드", "로버트 마틴");

        for(int i=0; i<library.length; i++){
            library[i].showBookInfo();
        }

        for(int i=0; i<library.length; i++){
            System.out.println(library[i]);
        }
    }
}
