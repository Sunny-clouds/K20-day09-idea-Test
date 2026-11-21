package com.onik.Text.b6;

/**
 * B6. 文本拼接与整数相加：同一个 +，两种结果
 */
public class B6 {
    public static void main(String[] args) {
        String count = " 12 ";
        String cleaned = count.trim();   // "12"

        System.out.println(cleaned + 5);                    // 125：左边是 String，走拼接
        System.out.println(Integer.parseInt(cleaned) + 5);  // 17 ：两边都是 int，走加法
    }
}
