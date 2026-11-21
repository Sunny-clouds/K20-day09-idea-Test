package com.onik.Text.b7;

/**
 * B7. 能解析不等于业务合法：parseInt 成功，件数却可能是负数
 */
public class B7 {
    public static void main(String[] args) {
        String text = "-3";
        int count = Integer.parseInt(text);   // 只保证“是整数”

        System.out.println(count);            // -3
        System.out.println(count > 0 ? "合法" : "件数非法");
    }
}
