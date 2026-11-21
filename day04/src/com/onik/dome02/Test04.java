package com.onik.dome02;

public class Test04 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        new Test04().aaa(a);
        System.out.println(a);
    }

    public void aaa(int a){
        System.out.println(a);
        a++;
        System.out.println(a);
    }
}
