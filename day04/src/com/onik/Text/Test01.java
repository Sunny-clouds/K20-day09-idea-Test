package com.onik.Text;

import java.util.Random;
import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {
        int[] list = Test01.into();
        for (int i : list) {
            System.out.print(i + " ");
        }
        int[] list1 = Test01.userChoose();
        boolean lan = list[6] == list1[6];
        int vip = Test01.jiangli(Test01.duihuan(list , list1),lan);
        if (vip == 0){
            System.out.println("很遗憾，你没有中奖！");
        } else {
            System.out.println("恭喜你，你中了" + vip + "等奖！");
        }
    }

    private static int jiangli(int pk, boolean lan) {
        if(pk == 6 && lan){
            return 1;
        }else if(pk == 6 ){
            return 2;
        }else if(pk == 5 && lan){
            return 3;
        }else if(pk == 5 || pk==4 && lan){
            return 4;
        }else if(pk == 4 || pk==3 && lan){
            return 5;
        }else if(lan){
            return 6;
        }else{
            return 0;
        }
    }

    private static int duihuan(int[] list, int[] list1) {
        int count = 0; //记录红色球的中奖个数
        for (int i = 0; i < list.length-1; i++) {
            for (int j = 0; j < list1.length-1; j++) {
                if (list[i] == list1[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static int[] into(){
        int[] list = new int[7];
        Random random = new Random();
        for (int i = 0; i < list.length - 1;) {
            int a = random.nextInt(1, 34);
            boolean ins = ins(a, list, i);
            if (ins){
                list[i] = a;
                i++;
            }
        }
        list[6] = random.nextInt(1, 17);
        return list;
    }

    public static boolean ins(int a, int[] list, int i) {
        for (int j = 0; j < i; j++) {
            if(a == list[j]){
                return false;
            }
        }
        return true;
    }

    public static int[] userChoose(){
        Scanner scanner = new Scanner(System.in);
        int[] list1 = new int[7];
        for (int i = 0; i < list1.length - 1;) {
            System.out.println("请输入第" + (i + 1) + "个红色数字：");
            int red = scanner.nextInt();
            boolean ins = ins(red, list1, i);
            if (ins){
                list1[i] = red;
                i++;
            }else{
                System.out.println("输入的红色数字无效！重新输入");
            }
        }
        while (true){
            System.out.println("请输入一个蓝色数字：");
            int blue = scanner.nextInt();
            if (blue >= 1 && blue <= 16){
                list1[6] = blue;
                return list1;
            }
            System.out.println("输入的蓝色数字无效！");
        }
    }
}
