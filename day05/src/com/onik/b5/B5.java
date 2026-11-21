package com.onik.b5;

/**
 * B5. setter 拦住负数价格
 * setter 收到负数时拒绝修改并保留原值。
 */
public class B5 {
    public static void main(String[] args) {
        Product p = new Product(4990);

        p.setPriceCents(-1);                       // 负数被拒绝
        System.out.println("价格 " + p.getPriceCents());   // 价格 4990

        p.setPriceCents(5290);                     // 合法
        System.out.println("价格 " + p.getPriceCents());   // 价格 5290
    }
}

class Product {
    private int priceCents;

    public Product(int priceCents) {
        this.priceCents = priceCents;
    }

    public void setPriceCents(int priceCents) {
        if (priceCents < 0) {
            return;                 // 拒绝负数，保持原值
        }
        this.priceCents = priceCents;
    }

    public int getPriceCents() {
        return priceCents;
    }
}
