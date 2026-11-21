package com.onik.entity._07_type;

public class Test07 {
    public static void main(String[] args) {

        char a = 'a';
        byte b = (byte) a;
        System.out.println("b=" + b);
        int c = a;
        System.out.println("c=" + c);
        int d = 130;
        byte e = (byte) d;
        System.out.println("e=" + e);
        byte g = 10;
        byte h = 2;
        byte i = (byte) (g / h);
        System.out.println("i=" + i);
    }
}
