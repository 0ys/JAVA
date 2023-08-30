package movie.pricing;

import money.Money;
import movie.MemberType;

public class Teens implements MemberType {
    @Override
    public Money calculateFee(Money money) {
        return Money.ZERO.plus(money).times(0.8);
    }
}
