package com.onik.Text.b1;

/**
 * B1. 状态文案比较：== 还是 equals
 * 两份文案都是从接口 new String(...) 拿到的，打印一样，但对象不同。
 */
public class B1 {
    public static void main(String[] args) {
        String first = new String("已签收");
        String second = new String("已签收");

        System.out.println(first == second);          // false：== 比较地址，两个不同对象
        System.out.println(first.equals(second));     // true ：equals 比较内容
    }
}
