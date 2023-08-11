package control;

public class For {
    public static void main(String[] args) {
        int i;
        int sum;
        for(i=0, sum=0; i<10; i++){

            sum += (i+1);
        }

        // break 문 ==============================================================================
        int sum1 = 0;
        int num = 0;

        for(num=0; ; num++){
            sum1 += num;
            if(sum1 >= 100)
                break;
        }

        System.out.println("num : " + num);
        System.out.println("sun : " + sum1);

        // continue 문 ==============================================================================
        int total =0;
        int num1;

        for(num1 =0; num1<=100; num1++){

            if( num1%2 == 0)
                continue;
            total += num1;

        }


        // 중첩 반복문 ==============================================================================
        int dan;
        int times;

        for(dan = 2; dan <=9; dan++){
            for(times = 1; times <=9; times++){
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
            System.out.println();
        }
    }
}
