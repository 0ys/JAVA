package datatype;

public class Variable {
    public static void main(String[] args) {
        //논리형 변수 선언 ==================================================================================
        System.out.println("논리형 변수");
        boolean isMarried = false;
        System.out.println(isMarried);

        // 정수형 변수 선언 ==================================================================================
        System.out.println("정수형 변수");
        byte bs = -128; // 8bit 표현, -2^7 ~ 2^7-1 (-128 ~ 127)
        System.out.println(bs);

        short st = 3000; // 2byte 표현, -2^15 ~ 2^25-1 (-32,768 ~ 32,767)
        System.out.println(st);

        int num = 10; // 4byte 표현, -2^31 ~ 2^31-1 (-2,147,483,648 ~ 2,147,483,647)
        System.out.println(num);

        long lNum = 12345678900L; // -2^63 ~ 2^63-1
        System.out.println(lNum);

        // 실수 자료형 ==================================================================================
        System.out.println("실수형 변수");
        double dNum = 3.14;
        float fNum = 3.14F; //식별자 필요
        System.out.println(dNum);
        System.out.println(fNum);

        // 문자 자료형 ==================================================================================
        System.out.println("문자형 변수");
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1);

        char ch2 = 66;
        System.out.println(ch2);

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char)ch3);

        char ch4 = '한';
        char ch5 = '\uD55C';
        System.out.println(ch4);
        System.out.println(ch5);

        // 상수 자료형 ==================================================================================
        // 항상 변하지 않는 상수를 선언할 때는 final을 사용함
        // 상수는 대문자를 주로 사용하고 _로 연결함
        // 상수는 값을 변경할 수 없음
        System.out.println("상수형 변수");
        final int MAX_NUM = 100;
        final int MIN_NUM;

        MIN_NUM = 0;

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

        // Type Inference ==================================================================================
        // 자바 10부터 자료형을 선언 하지 않아도 '지역 변수 자료형 추론' 가능
        System.out.println("자료형 추론");
        int i = 10;
        var j = 10.0;
        var str = "hello";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test";
        //str = 3; 한번 선언한 자료형 변수를 다른 자료형으로 사용할 수 없음

        // 묵시적 형 변환 ==================================================================================
        //byte -> (char) -> int -> long -> float -> double 로는 자연스럽게 묵시적 형 변환이 이루어짐
        System.out.println("묵시적 형 변환");
        byte bNum1 = 10;
        int iNum1 = bNum1;

        System.out.println(bNum1);
        System.out.println(iNum1);

        int iNum2 = 20;
        float fNum2 = iNum2;

        System.out.println(iNum2);
        System.out.println(fNum2);

        double dNum3;
        dNum3 = fNum2 + iNum2;
        System.out.println(dNum3);

        // 명시적 형 변환 ==================================================================================
        System.out.println("명시적 형 변환");
        int iNum4 = 1000; //byte가 표현할 수 있는 범위를 넘어서는 경우 자료 손실이 발생함
        byte bNum4 = (byte)iNum4;
        System.out.println(bNum4); // 1000이 아닌 -24가 출력됨

        double dNum5 = 1.2;
        float fNum5 = 0.9F;

        int iNum6 = (int)dNum5 + (int)fNum5;
        int iNum7 = (int)(dNum5 + fNum5);
        System.out.println(iNum6);
        System.out.println(iNum7);

    }
}
