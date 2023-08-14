package interfaceex;

public class CompleteCalc extends Calculator{
    @Override
    public int times(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num2 !=0)
            return num1/num2;
        else
            return CalC.ERROR;
    }

    public void showInfo() {
        System.out.println("Calc 인터페이스 구현함");
    }

    @Override
    public void description() {
        super.description();
//        System.out.println("재 정의된 디폴트 메서드");
    }
}
