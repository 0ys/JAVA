package polymorphism;
import java.util.ArrayList;

class Animal{
    public void move()
    {
        System.out.println("동물이 움직임");
    }
}

class Human extends Animal{
    public void move()
    {
        System.out.println("사람이 두 발로 걸음");
    }
}

class Tiger extends Animal{
    public void move()
    {
        System.out.println("호랑이가 네 발로 뜀");
    }
}

class Eagle extends Animal{
    public void move()
    {
        System.out.println("독수리가 하늘을 날아다님");
    }
}

public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest aTest = new AnimalTest();
        aTest.moveAnimal(new Human());
        aTest.moveAnimal(new Tiger());
        aTest.moveAnimal(new Eagle());
        // 어떤 매개 변수가 넘어왔느냐에 따라 출력문이 달라짐 -> 다형성
    }

    public void moveAnimal(Animal animal) { // 매개변수의 자료형이 상위 클래스
        animal.move();                     // 재정의된 메서드가 호출됨
    }
}