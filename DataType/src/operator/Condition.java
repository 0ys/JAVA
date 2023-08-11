package operator;

public class Condition {
    public static void main(String[] args) {
        int fatherAge = 45;
        int motherAge = 47;

        // 삼항 연산자
        char ch;
        ch = (fatherAge > motherAge) ? 'T' : 'F';

        System.out.println(ch);
    }
}
