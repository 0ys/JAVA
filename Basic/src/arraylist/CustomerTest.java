package arraylist;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerGong = new Customer(100, "Gong");
        customerGong.addBook("데미안", "헤르만 헤세");
        customerGong.addBook("수레바퀴 아래서", "헤르만 헤세");

        customerGong.showCustomerInfo();
    }
}
