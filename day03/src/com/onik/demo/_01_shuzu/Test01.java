package com.onik.demo._01_shuzu;


import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        // 创建一个数组
        int[] arr = new int[5];
        // 给数组赋值
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        String[] arr2 = new String[5];
        Scanner scanner = new Scanner(System.in);
        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("请输入一个字符串:");
            arr2[i] = scanner.next();
            System.out.println("你输入的字符串是:" + arr2[i]);
        }
    }
}
