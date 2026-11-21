package com.onik.demo.Text;

import java.util.Random;
import java.util.Scanner;

public class Text {

    public static void main(String[] args) {
        System.out.println("---------进入猜数字游戏---------");
        Scanner scanner = new Scanner(System.in);
        boolean isWin = true;
        int num = 0;
        while(isWin){
            System.out.println("请选择游戏难度：1.简单 2.普通 3.困难");
            int i = scanner.nextInt();
            switch (i){
                case 1 -> num = new Random().nextInt(1,11);
                case 2 -> num = new Random().nextInt(1,51);
                case 3 -> num = new Random().nextInt(1,101);
                default -> System.out.println("输入错误");
            }
            if (i>=1 && i<=3){
                isWin = false;
            }
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("你的第" + i + "次猜测：");
            int guess = scanner.nextInt();
            if (guess == num){
                System.out.println("恭喜你，猜对了！");
                break;
            } else if (guess > num) {
                System.out.println("猜大了！");
            } else {
                System.out.println("猜小了！");
            }
            if (i == 5){
                System.out.println("很遗憾，你没有猜对，游戏结束！");
                System.out.println("正确答案是：" + num);
            }
        }
    }
}
