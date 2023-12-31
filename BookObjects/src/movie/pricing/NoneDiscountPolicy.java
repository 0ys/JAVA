package movie.pricing;

import money.Money;
import movie.DiscountPolicy;
import movie.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening Screening) {
        return Money.ZERO;
    }
}
