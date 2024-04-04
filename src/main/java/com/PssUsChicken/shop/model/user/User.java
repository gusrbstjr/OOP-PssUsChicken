package com.PssUsChicken.shop.model.user;

import com.PssUsChicken.shop.model.user.memberShip.*;

import java.util.*;

public class User {
    private int seedMoney;
    private List<?> orders;                         // todo: change generic type to 'Order' related model
    private MembershipLevel membershipLevel;

    /**
     * Constructor
     * @param seedMoney seed money for user
     */
    public User(int seedMoney) {
        this.seedMoney = seedMoney;
        this.orders = new ArrayList<>();
        this.membershipLevel = new Bronze();    // todo: need to implement 'MembershipLevel'
    }

    // Properties
    public int getSeedMoney() {
        return seedMoney;
    }

    public void setSeedMoney(int seedMoney) {
        this.seedMoney = seedMoney;
    }

    public List<?> getOrders() {    // todo: need to change generic type after implementing 'Order' related model
        return orders;
    }

    public void updateMembership() {
        // 123
    }

    /**
     * @return user information
     */
    @Override
    public String toString() {
        StringBuilder formatted = new StringBuilder();

        formatted.append("Seed Money: ").append(seedMoney).append("\n");
        formatted.append("Membership Level: ").append(membershipLevel.getClass().getSimpleName()).append("\n");
        formatted.append("Orders[").append(orders.size()).append("]\n");
//        for(Order order : orders) {
//            formatted.append(order.toString()).append("\n");
//        }

        return formatted.toString();
    }
}
