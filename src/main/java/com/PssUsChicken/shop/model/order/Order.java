package com.PssUsChicken.shop.model.order;

import com.PssUsChicken.shop.model.Product.Product;

import java.io.IOException;

public class Order {
    private Product product;
    private int quantity;

    public Order() {}

    public Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
                "name='" + this.product.getName() + '\'' +
                ", price=" + this.product.getPrice() + '\'' +
                ", count=" + quantity +
                '}';
    }
}
