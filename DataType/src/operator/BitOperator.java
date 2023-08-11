package operator;

public class BitOperator {
    public static void main(String[] args) {

        // 반전 연산자 ======================================================
        int num1 = 10;
        System.out.println(~num1);

        // AND 연산자 ======================================================
        int num2 = 5;
        int num3 = 10;

        int result = num2 & num3;
        System.out.println(result);

        // OR 연산자 ======================================================
        int num4 = 5;
        int num5 = 10;

        int result2 = num4 | num5;
        System.out.println(result2);

        // XOR 연산자 ======================================================
        int num6 = 5;
        int num7 = 10;

        int result3 = num6 ^ num7;
        System.out.println(result3);

        // 비트 이동 연산자 ======================================================
        int num = 0B00000101;  //5를 8비트 2진수로 나타냄

        System.out.println(num << 2);   // 왼쪽으로 2비트 이동 00010100 (20)
        System.out.println(num >> 2);   // 오른쪽으로 2비트 이동 00000001 (1)
        System.out.println(num >>> 2);  // 오른쪽으로 2비트 이동 00000001 (1)
        System.out.println(num);

        num = num << 2;  // 왼쪽으로 2비트 이동한 값을 다시 Num에 대입
        System.out.println(num);

    }
}
