package com.onik.entity._06_shuzi;

public class Test06 {
    public static void main(String[] args) {

        int a = 1234;
        int g = a % 10;
        int s = a / 10 % 10;
        int b = a / 100 % 10;
        int d = a / 1000 % 10;
        System.out.println("1234的十位数是：" + s);
        System.out.println("1234的个位数是：" + g);
        System.out.println("1234的百位数是：" + b);
        System.out.println("1234的千位数是：" + d);
    }
}
