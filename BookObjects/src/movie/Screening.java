package movie;

import money.Money;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;
    private String place;
    private String room;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened, String place, String room) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
        this.place = place;
        this.room = room;
    }

    public LocalDateTime getStartTime() {
        return whenScreened;
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }

    public Reservation reserve(Customer customer, Member members) {
        return new Reservation(customer, this, calculateFee(members), members);
    }

    private Money calculateFee(Member members) {
        return members.calculateTotalFee(movie.calculateMovieFee(this));
    }

    public void showScreeningInfo() {
        movie.showMovieInfo();
        System.out.println("상영 날짜 및 시간: "+this.whenScreened.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        System.out.println("영화관: "+this.place);
        System.out.println("상영관: "+this.room);
    }

}
