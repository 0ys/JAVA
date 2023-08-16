package movie.pricing;

import money.Money;
import movie.DiscountPolicy;
import movie.Screening;
import movie.DiscountCondition;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }
    @Override
    protected Money getDiscountAmount(Screening Screening) {
        return discountAmount;
    }
}
