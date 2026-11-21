package com.onik.Demo01;

import java.util.Scanner;

public class Demo01 {

    public static void main(String[] args) {

        String str = "Hello, World!";
        String str2 = new String("Hello, World!");
        System.out.println(str.equals(str2));
        System.out.println(str2 == str);

        String str3 = "123";
        String str4 = "123";
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        System.out.println("============================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        //String name = scanner.next();
        //System.out.println(name == str3);
        //System.out.println(name.equals(str3));

        System.out.println("==================================");
        String aaa = "  tt ";
        String bbb = "";
        String ccc = "null";

        System.out.println("=========================");

        System.out.println(aaa.isEmpty()); // 判断是否为空
        System.out.println(aaa.isBlank()); // 判断是否为空白
        System.out.println(bbb.isEmpty()); // 判断是否为空
        System.out.println(bbb.isBlank()); // 判断是否为空白
        System.out.println(ccc.isEmpty()); // 判断是否为空

        System.out.println(aaa.length()); // 返回字符串的长度
        System.out.println(bbb.length()); // 返回字符串的长度
        System.out.println(ccc.length()); // 返回字符串的长度

        System.out.println(aaa.strip().length()); // 返回去除空白字符后的长度
        System.out.println(bbb.strip().length()); // 返回去除空白字符后的长度
        System.out.println(ccc.strip().length()); // 返回去除空白字符后的长度


    }
}
