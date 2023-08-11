package control;

public class SwitchCase {
    public static void main(String[] args) {

        int ranking = 1;
        char medalColor;

        switch(ranking){
            case 1: medalColor = 'G';
                break;
            case 2: medalColor = 'S';
                break;
            case 3: medalColor = 'B';
                break;
            default:
                medalColor = 'A';
        }

        System.out.println(ranking + "등 메달의 색깔은 " + medalColor + " 입니다.");

        // ========================================================================================

        int month = 10;
        int day;

        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            case 2:
                day = 28;
                break;
            default:
                day = 0;
                System.out.println("잘못된 입력입니다.");

        }

        System.out.println(month + "월은 총 " + day + "일 입니다.");
    }
}
