package abstractex.template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();
    public void startCar()
    {
        System.out.println("시동을 켬");
    }

    public  void turnOff()
    {
        System.out.println("시동을 끔");
    }

    final public void run() // 템플릿 메서드: 자동차가 달리는 방법을 순서대로 구현함
    {
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
    }
}
