package inheritance;

public class Overriding {
    public static void main(String[] args) {

        int price = 10000;
        Customer customerLee = new Customer(10010, "이예원");
        System.out.println(customerLee.getCustomerName() +" 님이 지불해야 하는 금액은 " + customerLee.calcPrice(price) + "원 입니다.");

        VIPCustomer customerKim = new VIPCustomer(10020, "김예슬", 12345);
        System.out.println(customerKim.getCustomerName() +" 님이 지불해야 하는 금액은 " + customerKim.calcPrice(price) + "원 입니다.");

        Customer vc = new VIPCustomer(10030, "너뭐돼?", 2000);  // VIPCustomer 인스턴스를 Customer형으로 변환
        System.out.println(vc.getCustomerName() +" 님이 지불해야 하는 금액은 " + vc.calcPrice(10000) + "원 입니다.");
        // 상속에서 상위 클래스와 하위 클래스에 같은 이름의 메서드가 존재할 때 호출되는 메서드는 인스턴스에 따라 결정됨
        // 따라서 일반 고객 클래스로 선언된 너뭐돼?님이 지불하는 금액은 VIP 금액인 9천원임
        // 가상 메서드


    }
}
