package com.PssUsChicken.shop.model.order;

import com.PssUsChicken.shop.model.Product.Product;

import java.io.IOException;

public class Order {
    private Product product;
    private long quantity;

    private long finalPrice; // final price of the order(applied discount)

    public Order() {}

    public Order(Product product, long quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Deprecated
//    public void order() {
//        System.out.println("Order order()입니다.");
//    }

    public long getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(long finalPrice) {
        this.finalPrice = finalPrice;
    }
//    public void delivery() {
//        System.out.println("공통된 delivery()입니다.");
//    }
//    public void pay() throws IOException {
//        System.out.println("Order의 pay()입니다.");
//    }

    @Override
    public String toString() {
        return "Order{" +
                "product type='" + this.product.getClass().getSimpleName() + '\'' +
                "name='" + this.product.getName() + '\'' +
                ", price=" + this.product.getPrice() + '\'' +
                ", count=" + quantity + '\'' +
                ", finalPrice=" + finalPrice + "'}";
    }
}
