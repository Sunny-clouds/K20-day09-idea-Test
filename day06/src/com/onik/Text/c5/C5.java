package com.onik.Text.c5;

/**
 * C5. 件数下界：解析只保证是整数，0 和 1 要另外判范围
 */
public class C5 {
    public static void main(String[] args) {
        check("0");   // 0 件数非法
        check("1");   // 1 合法
    }

    static void check(String text) {
        int count = Integer.parseInt(text);   // "0"、"1" 都能解析成功
        System.out.println(count + (count > 0 ? " 合法" : " 件数非法"));
    }
}
