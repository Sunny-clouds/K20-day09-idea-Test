package com.onik.Demo03;

public class Test03 {

    public static void main(String[] args) {
        int a = sum(20);
        System.out.println(a);
    }

    public static int sum(int a) {
        if (a == 1) {
            return 1;
        }
        if (a == 2){
            return 2;
        }
        return sum(a - 1) + sum(a - 2);
    }
}
