package com.onik.Demo01;

public class Test01 {
    public static void main(String[] args) {
        int aaa = sum(1,2,3,4,56,6,7);
        System.out.println(aaa);

    }

    public static int sum(int... a) {
        int count = 0;
        for (int i : a) {
            count += i;
        }
        return count;
    }
}
