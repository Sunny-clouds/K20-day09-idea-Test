package com.onik.b1;

/**
 * B1. 第一个商品对象
 * 用一个类同时保存 SKU、名称、价格(分)三个字段，替代三个分散的变量。
 */
public class B1 {
    public static void main(String[] args) {
        Product p = new Product();
        p.sku = "SKU-88";
        p.name = "收纳箱";
        p.priceCents = 4990;

        System.out.println(p.sku);
        System.out.println(p.name);
        System.out.println(p.priceCents);
    }
}

class Product {
    String sku;
    String name;
    int priceCents;
}
