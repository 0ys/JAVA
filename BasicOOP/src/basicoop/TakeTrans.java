package basicoop;

public class TakeTrans {
    public static void main(String[] args) {
        Student studentJames = new Student("James", 5000);
        Student studentTomas = new Student("Tomas", 10000);
        Student studentGong = new Student("Gong", 15000);

        Bus bus100 = new Bus(100);
        studentJames.takeBus(bus100);
        studentJames.showInfo();
        bus100.showInfo();

        Subway subwayGreen = new Subway("2호선");
        studentTomas.takeSubway(subwayGreen);
        studentTomas.showInfo();
        subwayGreen.showInfo();

        Taxi taxi2020 = new Taxi(2020);
        studentGong.takeTaxi(taxi2020);
        studentGong.showInfo();
        taxi2020.showInfo();
    }
}
