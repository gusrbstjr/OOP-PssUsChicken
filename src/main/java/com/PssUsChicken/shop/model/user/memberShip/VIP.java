package com.PssUsChicken.shop.model.user.memberShip;

public class VIP implements MembershipLevel {

    @Override
    public double getDiscountRate() {
        return 0.3;
    }
}