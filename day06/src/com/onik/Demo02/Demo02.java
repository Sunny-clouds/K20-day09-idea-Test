package com.onik.Demo02;

public class Demo02 {

    public static void main(String[] args) {

        String aaa = " hello word , 你好,Java";
        String[] result = aaa.split(" ", 2);
        for (String s : result) {
            System.out.println("------" + s + "------");
        }
    }
}
