package com.onik.demo._02_Test;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {

        int[] arr = {1,4,5,23,45,67,81,95,100,123,124};
        int min = 0;
        int max = arr.length -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要查找的数字：");
        int num = scanner.nextInt();

        while (min <= max){
            int i = (min + max) / 2;
            if(arr[i] < num){
                min = i + 1;
            } else if (arr[i] > num) {
                max = i -1;
            }else{
                System.out.println("你要的数字下标为：" + i);
                break;
            }
            if (min > max) {
                System.out.println("没有你要找的数字");
            }
        }
    }

}
