package com.PssUsChicken.shop.model.user.memberShip;

public class Silver implements MembershipLevel {

    @Override
    public double getDiscountRate() {
        return 0.1;
    }
}