package com.onik.Exam;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入份数：");
        if (!scanner.hasNextInt()) {
            System.out.println("输入格式有误");
            return;
        }
        int portions = scanner.nextInt();
        System.out.println("请输入会员等级（0 未注册，1 普通会员，2 超级会员）：");
        if (!scanner.hasNextInt()) {
            System.out.println("输入格式有误");
            return;
        }
        int member = scanner.nextInt();
        System.out.println("请输入当前库存数：");
        if (!scanner.hasNextInt()) {
            System.out.println("输入格式有误");
            return;
        }
        int stock = scanner.nextInt();



        if(portions < 1 || portions > 10){
            System.out.println("份数无效");
            return;
        }

        if(member < 0 || member > 2){
            System.out.println("会员等级无效");
            return;
        }else if (member == 0) {
            System.out.println("请先注册会员");
            return;
        }

        if(stock < portions){
            System.out.println("库存不足");
        } else if (member == 1 && portions > 8) {
            System.out.println("普通会员最多购买8份");
        }else{
            System.out.println("购买成功");
        }



    }
}
