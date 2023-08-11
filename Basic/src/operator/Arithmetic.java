package operator;

public class Arithmetic {
    public static void main(String[] args){

        int num1 = 10;
        int num2 = 20;

        System.out.println(+num1);
        System.out.println(-num2);
        System.out.println(num2);

        num2 = -num2;
        System.out.println(num2);

        int gameScore = 150;

        int lastScore1 = ++gameScore;
        int lastScore2 = --gameScore;

        System.out.println(lastScore1);  // 151
        System.out.println(lastScore2);  // 150

    }
}
