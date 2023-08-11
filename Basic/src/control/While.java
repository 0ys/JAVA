package control;

public class While {
    public static void main(String[] args) {

        int num = 1;
        int sum = 0;

        while(num <= 10){
            sum += num;
            num++;
        }

        // do-while ==============================================================================
        int num1 = 1;
        int sum1 = 0;

        do{
            sum1 += num1;
            num1++;

        }while( num1 <= 10  );
    }
}
