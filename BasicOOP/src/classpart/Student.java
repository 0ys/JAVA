package classpart;

public class Student {
    // 멤버 변수
    int studentID;
    private String studentName; // 정보 은닉
    int grade;
    String address;

    // 참조 자료형
    Subject korean;
    Subject math;


    public Student() {}

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;

        korean = new Subject();
        math = new Subject();
    }

    public void showStudentInfo(){
        int total = korean.getScorePoint() + math.getScorePoint();
        System.out.println("학생 " + studentName + "의 성적은 총 " + total + " 점 입니다.");
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public void setKorean(String name, int score)
    {
        korean.setSubjectName(name);;
        korean.setScorePoint(score);;
    }

    public void setMath(String name, int score)
    {
        math.setSubjectName(name);;
        math.setScorePoint(score);
    }

    public static void main(String[] args) {
        Student studentGong = new Student(); // 새로운 Student 클래스 생성
        studentGong.setStudentName("공예슬");
        studentGong.studentID = 2023;

        System.out.println(studentGong.getStudentName());
        System.out.println(studentGong.studentID);
    }





}
