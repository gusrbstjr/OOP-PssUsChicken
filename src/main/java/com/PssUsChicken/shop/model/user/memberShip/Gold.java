package com.PssUsChicken.shop.model.user.memberShip;

public class Gold implements MembershipLevel {

    @Override
    public double getDiscountRate() {
        return 0.2;
    }
}