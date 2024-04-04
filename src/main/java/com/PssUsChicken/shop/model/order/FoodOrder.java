package com.PssUsChicken.shop.model.order;

import com.PssUsChicken.shop.model.Product.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FoodOrder extends Order {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private String name;
    private int price;
    private int count;
    int limit = 50000;

    public FoodOrder(String name, int price, int count) {
        this.name = name;
        this.price = price * count;
        this.count = count;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void order() {
        System.out.println("고객님이 주문하신 상품은 " + this.name + "이고, 가격은 " + this.price + "원이고, " + "수량은 " + count + "개 입니다.");
    }

    @Override
    public void delivery() {
        if (this.price > limit) {
            System.out.println("총 금액은 " + this.price + "원 입니다.");
            System.out.println(limit + "이상 구매하여 배송비 무료이며 내일 오전 중으로 도착합니다.");
        } else {
            System.out.println("총 금액은 " + this.price + "원 입니다.");
            System.out.println("배송은 5 ~ 6일 정도 걸립니다.");
        }
    }

    @Override
    public void pay() throws IOException {
        System.out.println("결제는 어떻게 하시겠습니까? 1. 카드, 2. 계좌이체 : ");
        int n = Integer.parseInt(br.readLine());
        if(n == 2) {
            if (this.price > limit) {
                //System.out.println(this.price);
                this.price = (this.price - 5000);
                System.out.println("현금 계산으로 5,000원 할인 되었습니다.");

            }

        }
    }

    @Override
    public String toString() {
        return "FoodOrder{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
