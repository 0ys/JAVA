package abstractex.template;

public class AICar extends Car{
    @Override
    public void drive() {
        System.out.println("AICar");
        System.out.println("알아서 방향 전환을 함");
    }

    @Override
    public void stop() {
        System.out.println("스스로 멈춤");
    }

    @Override
    public void wiper() {
        System.out.println("날씨에 맞춰 자동으로 조절함");
    }
}
