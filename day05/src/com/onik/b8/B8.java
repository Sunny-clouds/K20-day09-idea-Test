package com.onik.b8;

/**
 * B8. 引用比较的是不是同一个对象
 * == 比较的是引用（地址），不是字段内容。
 */
public class B8 {
    public static void main(String[] args) {
        Waybill w1 = new Waybill("SF1001", 5.0);
        Waybill w2 = w1;                              // 同一个对象
        Waybill w3 = new Waybill("SF1001", 5.0);      // 内容相同但不是同一个对象

        System.out.println(w1 == w2);   // true
        System.out.println(w1 == w3);   // false
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
