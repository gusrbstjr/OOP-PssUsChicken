package com.PssUsChicken.shop;

import com.PssUsChicken.shop.model.user.User;

import java.io.*;
import java.util.*;

public class Program {
    private User user;

    public static void main(String[] args) throws IOException {
        Program p = new Program();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        // note: get seed money from user
        System.out.println("시작금액을 입력해주세요.");
        int seedMoney = Integer.parseInt(st.nextToken(reader.readLine()));
        p.user = new User(seedMoney);   // create user instance
        // p.myPageService = new MyPageService(p.user);

        // note: main menu runs on loop until user exits
        while(true) {
            System.out.println("주문하기 : 1");
            System.out.println("유저정보 확인 : 2");
            System.out.println("나가기 : 3");

            // get user input and parse to integer
            int menu = Integer.parseInt(st.nextToken(reader.readLine()));

            // check user input and run corresponding method
            if(menu == 1) p.orderMenu();            // Order menu
            else if(menu == 2) p.checkUserInfo();   // Check user info
            else if(menu == 3) {                    // Exit
                System.out.println("========== 주문 종료 ==========");
                return;
            } else System.out.println("잘못된 입력입니다.");
        }
    }

    public void orderMenu() {
        /*
         * ============== 상품 목록 ==============
         * ============== 카테고리를 골라주세요. ==============
         * ============== 브랜드를 골라주세요. ==============
         * ============== 상품을 골라주세요. ==============
         * ...
         **/
    }

    public void checkUserInfo() {
        // System.out.println("============== 유저 정보 ==============");
    }
}
