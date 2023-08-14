package interfaceex.bookshelf;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue shelfQueue = new BookShelf();
        shelfQueue.enQueue("데미안");
        shelfQueue.enQueue("수레바퀴 아래서");
        shelfQueue.enQueue("밤의 사색");

        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
    }
}
