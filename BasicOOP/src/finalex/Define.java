package finalex;
// 여러 파일에서 똑같이 공유해야 하는 상수 값의 경우, 하나의 파일에 모아 public static final로 선언하여 사용함
// static으로 선언했기 때문에 인스턴스를 생성하는 것과 관계없이 클래스 이름으로 참조할 수 있음

public class Define {
    public static final int MIN = 1;
    public static final int MAX = 99999;

    public static final int ENG = 1001;
    public static final int MATH = 2001;

    public static final double PI = 3.14;
    public static final String GOOD_MORNING = "Good Morning!";
}
