package abstractex.template;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("======자율 주행 자동차=======");
        Car myCar = new AICar();
        myCar.run();

        System.out.println("========그냥 자동차==========");
        Car yourCar = new ManualCar();
        yourCar.run();
    }
}
