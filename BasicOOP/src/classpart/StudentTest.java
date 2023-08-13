package classpart;

public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setStudentName("공예슬");

        Student student2 = new Student();
        student2.setStudentName("공예원");

        System.out.println(student1.getStudentName());
        System.out.println(student2.getStudentName());
        System.out.println(student1); // 참조 변수 값 출력
        System.out.println(student2);

        Student studentLee = new Student(1001, "Lee");

        studentLee.setKorean("국어", 100);
        studentLee.setMath("수학", 50);

        Student studentKim = new Student(1002, "Kim");

        studentKim.setKorean("국어", 70);
        studentKim.setMath("수학", 85);

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();
    }
}
