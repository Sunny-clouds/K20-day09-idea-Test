package com.onik.dome02;

public class Test02 {
    public void test() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Test02().test();
    }

}
