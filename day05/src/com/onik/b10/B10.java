package com.onik.b10;

/**
 * B10. 先判 null 再使用
 * 方法内先判断参数是否为 null，再读取字段。
 */
public class B10 {
    public static void main(String[] args) {
        printId(null);                          // 无运单
        printId(new Waybill("YT2002", 2.1));    // 运单 YT2002
    }

    static void printId(Waybill w) {
        if (w == null) {
            System.out.println("无运单");
        } else {
            System.out.println("运单 " + w.id);
        }
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
