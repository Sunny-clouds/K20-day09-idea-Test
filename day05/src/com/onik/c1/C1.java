package com.onik.c1;

/**
 * C1. 构造器里做校验
 * 对象一诞生就必须是合法状态：价格非法时修正为 0。
 */
public class C1 {
    public static void main(String[] args) {
        Product a1 = new Product("A1", -100);   // 价格非法 -> 修正为 0
        Product a2 = new Product("A2", 4990);   // 合法

        System.out.println(a1.getSku() + " " + a1.getPriceCents());   // A1 0
        System.out.println(a2.getSku() + " " + a2.getPriceCents());   // A2 4990
    }
}

class Product {
    private String sku;
    private int priceCents;

    public Product(String sku, int priceCents) {
        this.sku = sku;
        if (priceCents < 0) {
            this.priceCents = 0;
            System.out.println("价格已修正");
        } else {
            this.priceCents = priceCents;
        }
    }

    public String getSku() {
        return sku;
    }

    public int getPriceCents() {
        return priceCents;
    }
}
