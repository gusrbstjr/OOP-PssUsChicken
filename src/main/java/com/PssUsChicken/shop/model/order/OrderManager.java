package com.PssUsChicken.shop.model.order;

import com.PssUsChicken.shop.model.Product.Product;
import com.PssUsChicken.shop.model.user.User;

public class OrderManager {

    private User user;

    public OrderManager(User user) {
        this.user = user;
    }

    public void CreateOrder(Product product, int quantity) {

        // Order객체 생성
        Order order = new Order(product, quantity);

        // 값 계산
        // 1. 원금 * 수량
        // ex) cost(10,000원) = 2,000원(사과 1개 가격) * 사과 5개
        int cost = order.getProduct().getPrice() * order.getQuantity();

        // 2. 결제액에서 할인율만큼을 뺀 최종 결제금액 계산
        // (MemberShipLevel에서 GetDiscountRate() 가져오기)
        cost = cost - (int) (cost * this.user.getMembershipLevel().getDiscountRate());
        // 10,000 원, 10% 할인
        // 결제금액: 9,000원 = 10,000원 - (10,000원 * 0.1)

        // 3. 현재 가지고 있는 금액(시드머니) - 결제예정액 확인하여
        // 결제가능상태인지
        // 불가할경우 throw new Exception();

        // 내가 가진 돈 - cost (10,000원)
        if ( this.user.getSeedMoney() - cost < 0 ) {
            System.out.println("결제 금액이 부족합니다.");
            return;
        }

        // 가능할 경우 시드머니 차감 후
        this.user.setSeedMoney(this.user.getSeedMoney() - cost);

        // user의 orderlist에 주문 객체 추가
        this.user.getOrders().add(order);
    }

}
