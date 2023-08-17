package movie;

import money.Money;

public class Reservation {
    private Customer customer;
    private Screening Screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customer, Screening Screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.Screening = Screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }

    public void showInfo() {
        System.out.println(this.customer.getName()+"님, 영화 "+this.Screening.getMovieTitle()+" "+this.audienceCount+"명 예매하였습니다.");
        System.out.println("결제하실 금액은 "+this.fee+" 입니다.");
    }
}
