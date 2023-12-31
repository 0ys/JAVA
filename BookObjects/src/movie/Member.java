package movie;

import money.Money;

public class Member {
    private int adult;
    private int teen;
    private int child;

    public Member(int adult, int teen, int child) {
        this.adult = adult;
        this.teen = teen;
        this.child = child;
    }
    public Money calculateTotalFee(Money money){
        Money teenMoney =  Money.ZERO.plus(money).times(0.8).times(teen);
        Money childMoney =  Money.ZERO.plus(money).times(0.7).times(child);
        return money.times(adult).plus(teenMoney).plus(childMoney);
    }
    public void showMemberInfo(){
        System.out.printf("예매 매수: 성인 %d명, 청소년 %d명, 어린이 %d명\n", adult, teen, child);
    }
}
