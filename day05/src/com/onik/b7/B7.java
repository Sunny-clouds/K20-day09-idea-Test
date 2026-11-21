package com.onik.b7;

/**
 * B7. 两个变量指向同一个对象
 * w2 = w1 后两个引用指向同一对象，改一个另一个也看得到。
 */
public class B7 {
    public static void main(String[] args) {
        Waybill w1 = new Waybill("SF1001", 3.2);
        Waybill w2 = w1;          // w2 与 w1 指向同一个对象（别名）

        w2.weight = 5.0;          // 通过 w2 修改字段

        System.out.println("w1 " + w1.weight);   // w1 5.0
        System.out.println("w2 " + w2.weight);   // w2 5.0
        // 原因：对象变量保存的是引用（堆内存地址），w2 = w1 复制的是同一个引用，
        //      两个变量指向堆上同一个 Waybill 对象，所以改一个另一个也跟着变。
    }
}

class Waybill {
    String id;
    double weight;

    public Waybill(String id, double weight) {
        this.id = id;
        this.weight = weight;
    }
}
