package com.onik.b2;

/**
 * B2. 用构造器创建运单
 * 创建对象时必须同时给出单号和重量，不允许先建空对象再逐个补字段。
 */
public class B2 {
    public static void main(String[] args) {
        Waybill w = new Waybill("SF1001", 3.75);
        System.out.println(w.id + " " + w.weight);
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
