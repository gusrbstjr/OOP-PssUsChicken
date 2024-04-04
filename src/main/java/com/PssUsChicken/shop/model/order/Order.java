package com.PssUsChicken.shop.model.order;

import com.PssUsChicken.shop.model.Product.Product;

import java.io.IOException;

public class Order {
    Product product;
    private int count;

    public Order() {}

    public Order(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void order() {
        System.out.println("Order order()입니다.");
    }
    public void delivery() {
        System.out.println("공통된 delivery()입니다.");
    }
    public void pay() throws IOException {
        System.out.println("Order의 pay()입니다.");
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", price=" + price + '\'' +
                ", count=" + count +
                '}';
    }
}
