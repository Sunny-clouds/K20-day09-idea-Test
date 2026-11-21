package com.onik.demo._02_Test;

import java.util.Random;
import java.util.Scanner;

public class Text05 {

    public static void main(String[] args) {
        System.out.println("---------进入猜数字游戏---------");
        Scanner scanner = new Scanner(System.in);
        boolean isWin = true;
        int num = 0;
        int min = 1;
        int max = 0;
        int count = 5;
        while(isWin){
            System.out.println("请选择游戏难度：1.简单 2.普通 3.困难");
            int i = scanner.nextInt();
            switch (i){
                case 1 -> {
                    num = new Random().nextInt(1,11);
                    max = 10;
                }
                case 2 -> {
                    num = new Random().nextInt(1,51);
                    max = 50;
                }
                case 3 -> {
                    num = new Random().nextInt(1,101);
                    max = 100;
                }
                default -> System.out.println("输入错误");
            }
            if (i>=1 && i<=3){
                isWin = false;
            }
        }
        for (int i = 1; i <= count; i++) {
            System.out.println("你的第" + i + "次猜测：" + min + " ~ " + max);
            int guess = scanner.nextInt();
            if (guess == num){
                System.out.println("恭喜你，猜对了！");
                break;
            } else if (guess > num && guess <= max) {
                max = guess -1;
                System.out.println("猜大了！范围是：" + min + " ~ " + max);
            } else if (guess < num && guess >= min) {
                min = guess + 1;
                System.out.println("猜小了！范围是：" + min + " ~ " + max);
            }else{
                System.out.println("输入错误，请重新输入！");
                i--; // 重新输入机会
            }
            if (i == count){
                System.out.println("你已经用完了所有的机会！1块2次，请输入充值金额：");
                int i1 = scanner.nextInt();
                if (i1 == 1){
                    count += 2;
                    System.out.println("充值成功，你现在有" + count + "次机会！");
                } else {
                    System.out.println("很遗憾，你没有猜对，游戏结束！");
                    System.out.println("正确答案是：" + num);
                }
            }
        }
    }
}
