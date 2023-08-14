package abstractex.gamelevel;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("플래쉬처럼 달림");
    }

    @Override
    public void jump() {
        System.out.println("마리오처럼 점프함");
    }

    @Override
    public void turn() {
        System.out.println("턴도 함");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("========상급자 레벨입니당=======");
    }
}
