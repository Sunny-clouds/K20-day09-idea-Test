package com.onik.Text.c7;

/**
 * C7. 前导零的两种处理：直接拼接 vs 先转整数再相加
 */
public class C7 {
    public static void main(String[] args) {
        String location = "007";

        System.out.println(location + 5);                       // 0075：+ 左边是 String，拼接
        System.out.println(Integer.parseInt(location) + 5);     // 12：parseInt 后是 int，相加

        System.out.println("差异原因：+ 左边是文本就走拼接、保留原样；parseInt 把 \"007\" 当成数字 7，前导零丢失。");
    }
}
