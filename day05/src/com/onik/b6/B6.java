package com.onik.b6;

/**
 * B6. private 字段不能被外部直接改
 * 直接给 private 字段赋值会编译报错，只能通过 getter 读取。
 */
public class B6 {
    public static void main(String[] args) {
        Stock stock = new Stock(10);

        // stock.quantity = -5;
        // 编译错误: quantity has private access in Stock
        // 负库存这种非法状态被 private 挡在了外面。

        System.out.println("库存 " + stock.getQuantity());   // 库存 10
    }
}

class Stock {
    private int quantity;

    public Stock(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
