package inheritance.witharraylist;
import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<Customer>();
        // 자료형을 Customer로 선언함으로써 하위 클래스인 VIP와 Gold를 모두 사용할 수 있음

        Customer customerLee = new Customer(10010, "이씨");
        Customer customerShin = new Customer(10020, "신씨");
        Customer customerHong = new GoldCustomer(10030, "홍씨");
        Customer customerYul = new GoldCustomer(10040, "율씨");
        Customer customerKim = new VIPCustomer(10050, "김씨", 12345);

        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerHong);
        customerList.add(customerYul);
        customerList.add(customerKim);

        System.out.println("====== 고객 목록 =======");

        for( Customer customer : customerList){
            System.out.println(customer.showCustomerInfo()); // 다형성
        }

        System.out.println("====== 할인율과 보너스 포인트 =======");

        int price = 10000;
        for( Customer customer : customerList){
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() +" 님은 " +  + cost + "원 지불했습니다.");
            System.out.println(customer.getCustomerName() +" 님의 보너스 포인트는 " + customer.bonusPoint + "원 입니다.");
        }
    }
}
