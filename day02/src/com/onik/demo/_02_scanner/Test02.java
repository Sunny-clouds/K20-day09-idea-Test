package com.onik.demo._02_scanner;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();
        System.out.println("你输入的整数是：" + num);
        System.out.println("请输入一个字符串：");
        String str = scanner.next();
        System.out.println("你输入的字符串是：" + str);
        scanner.close();
    }
}
