package com.onik.Text.b3;

/**
 * B3. trim 的结果要接住：字符串本身不会被修改
 */
public class B3 {
    public static void main(String[] args) {
        String raw = " 13800001111 ";
        String cleaned = raw.trim();   // 必须用变量接住返回值

        System.out.println("[" + raw + "]");        // 原值还在，首尾空格没丢
        System.out.println("[" + cleaned + "]");    // 只有 cleaned 去掉了空格
    }
}
