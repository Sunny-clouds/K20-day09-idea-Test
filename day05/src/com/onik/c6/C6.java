package com.onik.c6;

/**
 * C6. 把对象传给方法
 * 参数传的是引用副本，方法内改字段会影响原对象。
 */
public class C6 {
    public static void main(String[] args) {
        Order order = new Order(25000);
        applyDiscount(order);   // 满 20000 减 2000
        System.out.println("应付 " + order.amountCents);   // 应付 23000
    }

    static void applyDiscount(Order order) {
        if (order.amountCents >= 20000) {
            order.amountCents -= 2000;
        }
        // 注意：若这里写成 order = new Order(...)，只是改了局部引用，外部看不到。
    }
}

class Order {
    int amountCents;

    public Order(int amountCents) {
        this.amountCents = amountCents;
    }
}
