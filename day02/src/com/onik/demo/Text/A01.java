package com.onik.demo.Text;

import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * B01
         */
        int[] score = {59,60,61};
        for (int i = 0; i < score.length; i++) {
            if (score[i] >= 60){
                System.out.println(score[i]);
            }else if(score[i] == 60){
                System.out.println(score[i]);
            }
        }

        /**
         * C09
         */
        System.out.println("输入年龄：");
        int age = scanner.nextInt();
        if (age >= 18 && age <= 21) {
            System.out.println("青年组");
        } else if(age > 21) {
            System.out.println("成人组");
        }else{
            System.out.println("未成年组");
        }

    }
}
