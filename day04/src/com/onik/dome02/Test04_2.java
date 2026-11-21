package com.onik.dome02;


public class Test04_2 {

    public static void main(String[] args) {
        int[] a = {10,0,90,87,-98,67,34};
        int aaa = 0;
        for (int i : a) {
            aaa += new Test04_2().aaa(i);
        }
        System.out.println("在0-100之间的数有" + aaa + "个");
    }

    public int aaa(int a){
        int count = 0;
        return a >= 0 && a <= 100 ? count+=1 : 0;
    }
}
