package com.onik.dome02;

import java.util.Random;

public class Test01 {

    public int test01(int min, int max) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        return new Random().nextInt(min, max + 1);
    }

    public static void main(String[] args) {
        System.out.println(new Test01().test01(1, 10));
    }
}
