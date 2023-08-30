package movie;

import money.Money;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money fee;
    private Member members;
    private String reservationID;
    private LocalDateTime reservationTime;
    private LocalDateTime now;


    public Reservation(Customer customer, Screening screening, Money fee, Member mebers) {
        this.reservationTime = LocalDateTime.now();
        this.reservationID = reservationTime.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.members = mebers;
    }

    public void showReservationInfo() {
        System.out.println("========================================");
        System.out.println(this.customer.getName()+"님의 예매 정보입니다.");
        System.out.println("예매 번호: "+this.reservationID);
        System.out.println("예매한 시각: "+this.reservationTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        members.showMemberInfo();
        System.out.println("지불액: "+this.fee);
        this.screening.showScreeningInfo();
    }

    public void cancelReservation(){
        this.now = LocalDateTime.now();
        CancelPolicy policy = new CancelPolicy(new CancelCondition(now.getDayOfWeek()));
        Money refundFee = policy.calculateRefundAmount(this.screening, this.fee);
        System.out.println("========"+this.customer.getName()+" 님의 예매를 취소합니다.==========");
        System.out.println("**예매 취소 내역**");
        System.out.println("예매 번호: "+this.reservationID);
        members.showMemberInfo();
        this.screening.showScreeningInfo();
        System.out.println("----------------------------------------");
        System.out.println("환불 금액: "+refundFee);
        System.out.println("*상영 1시간 전까지 예매 금액의 90%를 환불함");
    }
}
