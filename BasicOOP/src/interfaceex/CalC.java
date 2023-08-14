package interfaceex;

public interface CalC {
    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description(){ // 디폴트 메서드: 구현할 클래스에 기본으로 제공될 메서드, 재정의 가능
        System.out.println("정수 계산기 구현");
        myMethod(); // 디폴트 메서드에서 private 메서드 호출
    }

    static int total(int[] arr){ // 정적 메서드: 인스턴스 생성과는 상관없는 메서드
        int total = 0;

        for(int i: arr){
            total += i;
        }
        myStaticMethod(); // 정적 메서드에서 private static 메서드 호출
        return total;
    }

    private void myMethod() { // private 메서
        System.out.println("private 메서드 출력");
    }

    private static void myStaticMethod() {
        System.out.println("private static 메서드 출력.");
    }
}
