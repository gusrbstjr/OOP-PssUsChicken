package com.PssUsChicken.shop.model.order.deprecated;

import com.PssUsChicken.shop.model.order.Order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderMenu {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private Order order = null;

    //int limit = 200000;

    public void mainMenu() throws IOException {
        System.out.println("환영합니다.");

        while (true) {
            System.out.println("=============== 메뉴 ==============");
            System.out.println("1. Electronic, 2. Food");

            int menu = Integer.parseInt(br.readLine());

            switch (menu) {
                case 1:
                    selectElectronic();
                    break;
                case 2:
                    selectFood();
                    break;
                default:
                    System.out.println("다시 입력해주세요.");
                    break;
            }
        }
    }

        public void selectElectronic () throws IOException {
            System.out.println("삼송과 파인애플중 어떤 것을 선택하시겠습니까? : ");
            String str = br.readLine();
            System.out.println("수량을 선택하세요 : ");
            int cnt = Integer.parseInt(br.readLine());

            if (str.equals("삼송")) {
                order = new ElectronicOrder(str, 79000, cnt);
            } else if (str.equals("파인애플")) {
                order = new ElectronicOrder(str, 99000, cnt);
            }

//            order.delivery();
//            order.pay();
//            order.order();

        }

        public void selectFood () throws IOException {
            System.out.println("김치와 된장 중 어떤 것을 구매하시겠습니까? : ");
            String foods = br.readLine();
            System.out.println("몇 개 사시겠습니까? : ");
            int cnt = Integer.parseInt(br.readLine());

            if(foods.equals("김치")) {
                order = new FoodOrder(foods, 8000, cnt);
            } else if(foods.equals("된장")) {
                order = new FoodOrder(foods, 9000, cnt);
            }
//
//            order.delivery();
//            order.pay();
//            order.order();

        }



}