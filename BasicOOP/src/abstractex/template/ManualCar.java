package abstractex.template;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("사람이 운전을 함");
    }

    @Override
    public void stop() {
        System.out.println("브레이크로 정지함");
    }

    @Override
    public void wiper() {
        System.out.println("사람이 빠르기를 조절함");
    }
}
