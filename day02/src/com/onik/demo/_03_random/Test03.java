package com.onik.demo._03_random;

import java.util.Random;

public class Test03 {

    public static void main(String[] args) {
        System.out.print("随机数是：");
        int i = new Random().nextInt();
        System.out.println(i);

        System.out.print("随机数是：");
        int j = new Random().nextInt(5);
        System.out.println(j);

        System.out.print("随机数是：");
        int k = new Random().nextInt(5,10);
        System.out.println(k);
    }
}
