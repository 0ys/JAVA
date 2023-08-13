package downcasting;
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

    public void readBook()
    {
        System.out.println("사람이 책을 읽음");
    }
}

class Tiger extends Animal{
    public void move()
    {
        System.out.println("호랑이가 네 발로 뜀");
    }

    public void hunting()
    {
        System.out.println("호랑이가 사냥을 함");
    }
}

class Eagle extends Animal{
    public void move()
    {
        System.out.println("독수리가 하늘을 날아다님");
    }

    public void flying()
    {
        System.out.print("독수리가 날개를 피고 날아오름");
    }
}

public class AnimalTest {
    ArrayList<Animal> aniList = new ArrayList<Animal>();

    public static void main(String[] args) {
        AnimalTest aTest = new AnimalTest();
        aTest.addAnimal();
        System.out.println("=======원래 형으로 다운 캐스팅=======");
        aTest.testCasting();

    }

    public void addAnimal() {
        aniList.add(new Human());
        aniList.add(new Tiger());
        aniList.add(new Eagle());

        for(Animal ani: aniList) {
            ani.move();
        }
    }

    public void testCasting() {
        for(int i=0; i<aniList.size(); i++) {
            Animal ani = aniList.get(i);
            if(ani instanceof Human) {
                Human h = (Human) ani;
                h.readBook();
            }
            else if(ani instanceof Tiger) {
                Tiger t = (Tiger) ani;
                t.hunting();
            }
            else if(ani instanceof Eagle) {
                Eagle e = (Eagle) ani;
                e.flying();
            }
            else {
                System.out.println("지원하지 않는 형 입니다.");
            }
        }
    }
}
