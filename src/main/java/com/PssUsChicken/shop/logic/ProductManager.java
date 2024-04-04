package com.PssUsChicken.shop.logic;

import com.PssUsChicken.shop.model.Product.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private ArrayList<Product> productList = new ArrayList<>();

    public ArrayList<Product> getProductList() {
        return productList;
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "productList=" + productList +
                '}';
    }
}
