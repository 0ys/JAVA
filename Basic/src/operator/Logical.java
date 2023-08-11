package operator;

public class Logical {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        boolean flag = (num1 > 0) && (num2 > 0);
        System.out.println(flag);

        flag = (num1 < 0) && (num2 > 0);
        System.out.println(flag);

        flag = (num1 > 0) || (num2 > 0);
        System.out.println(flag);

        flag = (num1 < 0) || (num2 > 0);
        System.out.println(flag);

        flag = !(num1 > 0);
        System.out.println(flag);

        //단락 회로 평가(SCE; Short Circuit Evaluation)======================================================
        int num = 10;
        int i = 2;

        // 앞이 거짓이므로 뒤의 i는 영향을 받지 않음
        boolean value = ((num = num + 10 ) < 10) && ( ( i = i + 2 ) < 10);
        System.out.println(value);
        System.out.println(num);
        System.out.println(i);

        // 앞이 참이므로 뒤의 i는 영향을 받지 않음
        value = ((num = num + 10 ) > 10) || ( ( i = i + 2 ) < 10);
        System.out.println(value);
        System.out.println(num);
        System.out.println(i);
    }
}
