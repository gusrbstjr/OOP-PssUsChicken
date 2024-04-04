package com.PssUsChicken.shop;

import com.PssUsChicken.shop.logic.*;
import com.PssUsChicken.shop.model.Product.Electronic;
import com.PssUsChicken.shop.model.Product.Food;
import com.PssUsChicken.shop.model.Product.Product;
import com.PssUsChicken.shop.model.order.Order;
import com.PssUsChicken.shop.model.user.User;

import java.io.*;
import java.util.*;

public class Program {

    private User user;
    private ProductManager productManager = new ProductManager();
    private OrderManager orderManager;

    public static void main(String[] args) throws IOException {
        Program p = new Program();

        p.init();

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        // use StringTokenizer to parse user input
//        StringTokenizer st = new StringTokenizer(" ");
        Scanner sc = new Scanner(System.in);

        // note: get seed money from user
        System.out.println("시작금액을 입력해주세요.");
//        int seedMoney = Integer.parseInt(st.nextToken(reader.readLine()));

        int seedMoney = sc.nextInt(); sc.nextLine();    // flush
        p.user = new User(seedMoney);   // create user instance
        p.orderManager = new OrderManager(p.user);

        // note: main menu runs on loop until user exits
        while (true) {
            System.out.println("============== 메뉴 ==============");
            System.out.println("1: 주문하기");
            System.out.println("2: 유저정보 확인");
            System.out.println("3: 나가기");

            // get user input and parse to integer
//            int menu = Integer.parseInt(st.nextToken(reader.readLine()));
            int menu = sc.nextInt(); sc.nextLine();    // flush

            // check user input and run corresponding method
            if (menu == 1) {
                System.out.println();
                System.out.println("============== 상품 목록 ==============");
//                System.out.println();

                ArrayList<Product> productList = p.productManager.getProductList();

                for (int i = 0; i < productList.size(); i++) {
                    System.out.println((i + 1) + "번째 상품 : " + productList.get(i).getName() + " - " + productList.get(i).getPrice());
                }

                System.out.println();
                System.out.println("============== 상품번호를 골라주세요. ==============");
//                System.out.println();

//                int productNum = Integer.parseInt(st.nextToken(reader.readLine())); // 상품 입력
                int productNum = sc.nextInt(); sc.nextLine();    // flush

                System.out.println();
                System.out.println("============== 수량을 입력해주세요. ==============");
//                System.out.println();

//                int productAmt = Integer.parseInt(st.nextToken(reader.readLine())); // 상품 입력
                int productAmt = sc.nextInt(); sc.nextLine();    // flush

                // 주문시작
                try {
                    Order order = p.orderManager.createOrder(productList.get(productNum - 1), productAmt);

                    System.out.println("주문이 완료되었습니다.");
                    System.out.println("주문 정보 : " + order.toString());
                } catch (Exception e) {
                    System.out.println("돈부족 : " + e.getMessage());
                }
            } else if (menu == 2) {
                System.out.println("============== 유저 정보 ==============");
                System.out.println(p.user.toString());
            } else if (menu == 3) {                    // Exit
                System.out.println("========== 주문 종료 ==========");
                return;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    public void init() {
        productManager.getProductList().add(new Food("김치", 8000));
        productManager.getProductList().add(new Food("된장", 9000));
        productManager.getProductList().add(new Electronic("Galaxy S21", 990000));
        productManager.getProductList().add(new Electronic("iPhone 12", 1100000));
    }

}
