package finalex;

public class UsingDefine {
    public static void main(String[] args) {

        System.out.println(Define.GOOD_MORNING);   //static으로 선언하여 클래스 이름으로 참조가능!
        System.out.println("최솟값은 " +  Define.MIN + " 입니다.");
        System.out.println("최댓값은 " +  Define.MAX + " 입니다.");
        System.out.println("수학의 코드 값은 " + Define.MATH + " 입니다.");
        System.out.println("국어의 코드 값은 " + Define.ENG + " 입니다.");

    }
}
