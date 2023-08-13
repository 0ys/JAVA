package staticex;

public class StudentTest {
    public static void main(String[] args) {
        System.out.println("static 변수: "+Student.getSerialNum());

        Student studentGong = new Student();
        studentGong.setStudentName("공예슬");
        System.out.println(studentGong.getStudentName()+"의 학번: "+studentGong.studentID);

        Student studentHwang = new Student();
        studentHwang.setStudentName("황석주");
        System.out.println(studentHwang.getStudentName()+"의 학번: "+studentHwang.studentID);

        School yonsei = School.getInstance();
        System.out.println("학교는 "+yonsei);
    }
}
