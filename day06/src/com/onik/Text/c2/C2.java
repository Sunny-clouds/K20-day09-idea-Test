package com.onik.Text.c2;

/**
 * C2. 缺列时不能取第三列：先看 parts.length，再访问下标
 */
public class C2 {
    public static void main(String[] args) {
        String[] parts = "SF123,2".split(",", -1);

        if (parts.length < 3) {
            System.out.println("列数不足:" + parts.length);   // 列数不足:2
            return;                                          // 到这里就停止，不访问 parts[2]
        }

        // 只有列数够才会走到这里
        System.out.println("日期列:" + parts[2]);
    }
}
