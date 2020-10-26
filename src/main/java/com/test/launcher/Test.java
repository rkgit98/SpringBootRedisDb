package com.test.launcher;

import com.test.model.Product;

public class Test {

    public static void main(String[] args) {
        Product product = new Product();

        product.setProductName("mobile");
        product.setProductCost(5000);
        product.setManufacturer("samsung");

        System.out.println(product);
    }
}
