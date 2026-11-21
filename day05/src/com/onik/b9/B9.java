package com.onik.b9;

/**
 * B9. null 调用字段
 * 对 null 取字段会抛 NullPointerException，用之前要判空。
 */
public class B9 {
    public static void main(String[] args) {
        Waybill w = null;

        try {
            System.out.println(w.id);     // 对 null 取字段 -> 空指针异常
        } catch (NullPointerException e) {
            System.out.println("异常类名: " + e.getClass().getName());
        }

        // 修复：先把出错行注释掉，使用前判空
        if (w == null) {
            System.out.println("查询结果为空");
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
