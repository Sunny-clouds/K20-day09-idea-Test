package com.onik.Demo02;

public class Demo02 {
    public static void main(String[] args) {

        int a = sum(10);
        System.out.println(a);
    }

    public static int sum(int a) {
        if (a == 1){
            return 1;
        }
        return sum(a - 1) * a;

    }
}
