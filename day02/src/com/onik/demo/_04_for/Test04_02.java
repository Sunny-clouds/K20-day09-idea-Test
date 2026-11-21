package com.onik.demo._04_for;

import java.util.Scanner;

public class Test04_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入初始数：");
        int a = scanner.nextInt();
        System.out.println("请输入终点数：");
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 7 != 0){
                for (int j = i; j > 0; j /= 10){
                    int i1 = j % 10;
                    if (i1 == 7){
                        System.out.println(i + " 过");
                        break;
                    }
                }
            }else{
                System.out.println(i + " 过");
            }
        }
    }

}
