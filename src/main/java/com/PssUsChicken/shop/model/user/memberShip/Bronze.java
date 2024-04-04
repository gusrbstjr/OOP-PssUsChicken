package com.PssUsChicken.shop.model.user.memberShip;

public class Bronze implements MembershipLevel{

    @Override
    public double getDiscountRate() {
        return 0.0;
    }
}