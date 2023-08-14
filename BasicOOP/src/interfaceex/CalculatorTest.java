package interfaceex;

import java.net.SocketOption;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        CompleteCalc calc = new CompleteCalc(); // CompleteCalc만 인스턴스 생성 가능 -> 나머지는 모두 추상 클래스 또는 추상 메서드 존재
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));
        calc.showInfo();
        calc.description(); // 디폴트 메서드 호출

        int[] arr = {1,2,3,4,5};
        System.out.println(CalC.total(arr)); // 인터페이스 이름으로 직접 참조하여 정적 메서드 호출

    }
}
