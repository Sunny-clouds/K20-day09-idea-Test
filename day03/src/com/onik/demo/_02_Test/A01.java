package com.onik.demo._02_Test;

import java.util.Random;
import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /**
         * A01
         */
        int[] arr = {72,75,121,90};
        int count5 = 0;
        int aaa = 0;
        int bbb = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 75){
                count5++;
                if (bbb == 0){
                    bbb = i;
                }
            } else if (arr[i] < 75) {
                aaa++;
            }
        }
        if (bbb == 0){
            System.out.println("没有超标的下标：-1");
        } else {
            System.out.println("首个超标的下标为：" + bbb);
        }
        System.out.println("超标个数：" + count5);
        System.out.println("不超标个数：" + aaa);

        /**
         * A02
         */
        int[] arr1 = {1,2,0,1,2,0,0,0,1,2,0,1,2,0,0,0};
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] > 1 || arr1[i] < 0){
                count++;
            }
            if(arr1[i] == 0){
                System.out.println((i + 1));
            }
        }
        System.out.println("无效的个数为：" + count);

        /**
         * A03
         */
        int[] arr2 = {-1,2,3,4,-1,6};
        int sum = 0;
        int count1 = 0;
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] != -1){
                sum += arr2[i];
                count1++;
            }
        }
        System.out.println("累计包裹数:" + sum);
        System.out.println("已上报天数:" + count1);

        /**
         * A04
         */
        int[] arr3 = {1,2,3,4,5,6};
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                System.out.print("  " + arr3[i] + "-" + arr3[j]);
            }
        }

        /**
         * A05
         */
        int sum1 = 0;
        int count2 = 0;
        while (true) {
            System.out.println("请输入要捐款的金额（-1为退出）：");
            int i = scanner.nextInt();
            if (i == -1) {
                break;
            }else{
                sum1 += arr1[i];
                count2++;
            }
        }
        System.out.println("累计捐款数:" + sum1);
        System.out.println("已捐款次数:" + count2);

        /**
         * A06
         */
        Boolean isWin = true;
        int num = 0;
        do {
            System.out.println("输入1~4之间的数字：");
            int i = scanner.nextInt();
            num++;
            if (i >= 1 && i <= 4) {
                System.out.println("输入正确！");
                isWin = false;
            } else {
                System.out.println("输入错误，请重新输入！");
            }
        }while (isWin);
        System.out.println("尝试次数：" + num);

        /**
         * A07
         */
        Boolean isWin1 = true;
        while (isWin1){
            int a = new Random().nextInt(1, 13);
            for (int i = 1; i <= 4; i++) {
                System.out.println("第" + (i+1) + "次猜测为：");
                int guess = scanner.nextInt();
                if (a == guess){
                    System.out.println("猜对了：" + a);
                    isWin1 = false;
                    break;
                } else if (guess > a) {
                    System.out.println("猜大了！");
                } else {
                    System.out.println("猜小了！");

                }
                if (i == 4){
                    System.out.println("很遗憾，你没有猜对，游戏结束！");
                    System.out.println("正确答案是：" + a);
                    isWin1 = false;
                    break;
                }
            }

        }

        /**
         * A08
         */
        int[] arr4 = {1,2,3,4,5,6};
        System.out.println("请输入同行人数：");
        int i1 = scanner.nextInt();
        for (int i = 0; i < arr4.length; i++) {
            if(i1 <= arr4[i]){
                System.out.println("第" + (i+1) + "辆车可以坐下！");
            }
        }

        /**
         * A09
         */
        int[] arr5 = {4,0,7,0,1};
        for (int i = arr5.length - 1; i >= 0; i--) {
            if(arr5[i] == 0){
                System.out.println("下标为：" + i);
                break;
            }else if(i == 0){
                System.out.println("没有找到0:-1");
            }
        }

        /**
         * A10
         */
        Boolean isWin2 = true;
        int num2 = 0;
        int num3 = 1;
        while (isWin2){
            System.out.println("输入整数：");
            int i = scanner.nextInt();
            if (i >= 1 && i <= 8){
                num2++;
            } else if (i == 0) {
                System.out.println("输入结束！");
                isWin2 = false;
            } else {
                num3++;
            }
        }
        System.out.println("有效输入次数：" + num2);
        System.out.println("无效输入次数：" + num3);
    }
}
