package hello.core.dicount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixDiscount = 1000;
    @Override
    public int discount(Member member, Integer price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixDiscount;
        }
        return 0;
    }
}