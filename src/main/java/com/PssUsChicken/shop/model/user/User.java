package com.PssUsChicken.shop.model.user;

import java.util.*;
import java.util.List;

public class User {
    private int seedMoney;
    private List<?> orders;                         // todo: change generic type to 'Order' related model
    // private IMembership membershipLevel;     // todo: need to implement 'MembershipLevel'

    /**
     * Constructor
     * @param seedMoney seed money for user
     */
    public User(int seedMoney) {
        this.seedMoney = seedMoney;
        this.orders = new ArrayList<>();
        // this.membershipLevel = new MembershipLevel();    // todo: need to implement 'MembershipLevel'
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

    /**
     * @return user information
     */
    @Override
    public String toString() {
        // todo: return formatted string(need to implement)
        return "";
    }
}
