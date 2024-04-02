package com.PssUsChicken.shop.controller;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

public class MiniController {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

//        ProductService productService = new ProductService();
//        MyPageService myPageService = new MyPageService();
//        OrderService orderService = new OrderService();




        while (true) {
            System.out.println("주문하기 : 1");
            System.out.println("유저정보 확인 : 2");
            System.out.println("나가기 : 3");

            int menu = Integer.parseInt(st.nextToken(br.readLine()));

            /**
             * 카테고리 -> 브랜드 -> 상품목록
             */
            if (menu == 1) {
                System.out.println();
                System.out.println("============== 상품 목록 ==============");
                System.out.println();


//                List<Product> productList = productService.getProductList();


//                for (int i = 0; i < productList.size(); i++) {
//                    System.out.println((i+1) + "번째 상품 : " + productList.get(i));
//
//                }

                System.out.println();
                System.out.println("============== 상품번호를 골라주세요. ==============");
                System.out.println();

                int productNum = Integer.parseInt(st.nextToken(br.readLine())); // 상품 입력

//                orderService.saveOrder(productNum); // 주문 시작



            }
            else if (menu == 2) {
                System.out.println("============== 유저 정보 ==============");

//                User userInfo = myPageService.getUserInfo();

//                System.out.println("userInfo = " + userInfo.toString());

            }
            else{
                System.out.println("========== 주문 종료 ==========");
                break;
            }



        }
    }


}

