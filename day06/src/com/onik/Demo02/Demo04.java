package com.onik.Demo02;

import java.util.Arrays;
import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = scanner.next();
        String[] arr = str.split(",");
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        //筛选出所有偶数
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                System.out.print("偶数为：" + arr2[i] + " ");
            }
        }
    }
}
