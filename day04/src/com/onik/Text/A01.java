package com.onik.Text;

import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {

        A01_01 fa = new A01_01();
        /**
         * A01
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入停了多久：");
        int i = sc.nextInt();
        fa.stopCar(i);

    }
}
