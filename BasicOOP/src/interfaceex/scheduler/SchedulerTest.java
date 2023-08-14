package interfaceex.scheduler;
import java.io.IOException;
public class SchedulerTest {
    public static void main(String[] args) throws IOException {

        System.out.println("전화 상담 할당 방식을 선택하세요.");
        System.out.println("R : Round Robin");
        System.out.println("L : Least Job ");
        System.out.println("P : Priority Allocation ");

        int ch = System.in.read();
        Scheduler scheduler = null;

        if(ch == 'R' || ch == 'r'){
            scheduler = new RoundRobin();
        }
        else if(ch == 'L' || ch == 'l'){
            scheduler = new LeastJob();
        }
        else if(ch == 'P'|| ch == 'p'){
            scheduler = new PriorityAllocation();
        }
        else if(ch == 'A' || ch == 'a'){
            scheduler = new AgentGetCall();
        }
        else{
            System.out.println("지원하지 않는 기능입니다.");
            return;
        }

        // 어떤 정책인가와는 상관없이 인터페이스에서 선언한 메서드 호출
        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
