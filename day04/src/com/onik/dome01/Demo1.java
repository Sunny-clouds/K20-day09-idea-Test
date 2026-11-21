package com.onik.dome01;

import java.util.Scanner;

public class Demo1 {

    public String getS(int a) {
        return a % 2 == 0 ? "偶数" : "奇数";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数字：");
        int a = sc.nextInt();
        System.out.println(new Demo1().getS(a));
    }
}
