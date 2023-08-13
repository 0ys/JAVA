package thisex;

class BirthDay { // 객체를 코드로 만든 클래스
    int day;
    int month;
    int year;

    BirthDay() {
        // this.day =1;
        this(2023, 8); // this를 사용해 BirthDay(int, int) 생성자 호출
        // 이렇게 this를 사용하여 다른 생성자를 호출할 때는 그 이전에 어떠한 statements도 사용할 수 없음
        // Call to 'this()' must be first statement in constructor body ERROR 발생함
        // 생성자는 클래스가 생성될 때 호출되기 때문에 클래스 생성이 완료되지 않은 시점에 다른 코드가 있으면 오류가 발생할 수 있음
    }
    BirthDay(int year, int month){
        this.year = year;
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year; //bDay.year = year; 와 같음
    }
    public void printThis() {
        System.out.println(this);
    }
    BirthDay returnItSelf() {
        return this; // 자신의 주소를 반환하는 this
    }
}
public class ThisEx { // 테스트용 클래스
    public static void main(String[] args) {
        BirthDay bDay = new BirthDay(2000, 1);
        bDay.setYear(2000);
        System.out.println(bDay); // 참조 변수 출력
        bDay.printThis(); // This 출력
        System.out.println(bDay.year);

        BirthDay bDay2 = new BirthDay();
        System.out.println(bDay2.year);
        System.out.println(bDay2.month);

        BirthDay b = bDay2.returnItSelf();
        System.out.println(b);
        System.out.println(bDay2);
    }
}
