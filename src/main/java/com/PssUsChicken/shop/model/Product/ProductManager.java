package com.PssUsChicken.shop.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductManager {

    private List <Product> productList = new ArrayList<>();

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "productList=" + productList +
                '}';
    }
}
