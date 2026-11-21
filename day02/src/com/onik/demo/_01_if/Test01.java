package com.onik.demo._01_if;

public class Test01 {
    public static void main(String[] args) {

        int a = 19;
        if(a >= 18){
            System.out.println("a大于18");
        }
        System.out.println("程序结束");

        if (a > 18) {
            System.out.println("a大于18");
        }else {
            System.out.println("a不大于18");
        }
        System.out.println("程序结束");


        int score = 91;
        if (score <= 100 && score > 90) {
            System.out.println("score小于等于100且大于90");
        }else if (score <= 90 && score > 80) {
            System.out.println("score小于90且大于80");
        }else if (score <= 80 && score > 70) {
            System.out.println("score小于80且大于70");
        }else if (score <= 70 && score > 60) {
            System.out.println("score小于70且大于60");
        }else {
            System.out.println("score小于60");
        }



        int choose = 2;
        switch (choose){
            case 1 -> System.out.println("今天是周一");
            case 2 -> System.out.println("今天是周二");
            case 3 -> System.out.println("今天是周三");
            case 4 -> System.out.println("今天是周四");
            case 5 -> System.out.println("今天是周五");
            case 6 -> System.out.println("今天是周六");
            case 7 -> System.out.println("今天是周日");
            default -> System.out.println("非法选择");
        }
    }
}
