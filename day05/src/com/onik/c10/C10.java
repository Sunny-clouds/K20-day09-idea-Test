package com.onik.c10;

/**
 * C10. 扣库存方法
 * 对外只暴露 deduct(int n)，由对象自己保证不会扣成负数。
 */
public class C10 {
    public static void main(String[] args) {
        Stock stock = new Stock(5);

        System.out.println("扣3 -> " + stock.deduct(3));   // true，剩 2
        System.out.println("扣3 -> " + stock.deduct(3));   // false，3 > 2
        System.out.println("扣0 -> " + stock.deduct(0));   // false，n <= 0

        System.out.println("最终库存 " + stock.getQuantity());   // 2
    }
}

class Stock {
    private int quantity;

    public Stock(int quantity) {
        this.quantity = quantity;
    }

    public boolean deduct(int n) {
        if (n <= 0 || n > quantity) {
            return false;       // 非法或不足，不修改
        }
        quantity -= n;
        return true;
    }

    public int getQuantity() {
        return quantity;
    }
}
