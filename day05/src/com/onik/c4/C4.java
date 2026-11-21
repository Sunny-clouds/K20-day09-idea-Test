package com.onik.c4;

/**
 * C4. 引用赋值的别名效应
 * 改字段时两个变量互相可见；重新 new 只改变其中一个变量的指向。
 */
public class C4 {
    public static void main(String[] args) {
        Stock s1 = new Stock(10);
        Stock s2 = s1;          // s2 与 s1 指向同一个对象

        s2.quantity = 5;        // 通过 s2 改字段
        System.out.println("s1 " + s1.quantity);   // s1 5

        s2 = new Stock(99);     // 重新 new，只让 s2 指向新对象
        System.out.println("s1 " + s1.quantity);   // s1 5
        System.out.println("s2 " + s2.quantity);   // s2 99
        // 解释：= 复制的是引用值(地址)而不是对象本身；
        //      改字段时两个变量指向同一对象所以互相可见；
        //      重新 new 后 s2 指向新对象，s1 仍指向原来的对象。
    }
}

class Stock {
    int quantity;

    public Stock(int quantity) {
        this.quantity = quantity;
    }
}
