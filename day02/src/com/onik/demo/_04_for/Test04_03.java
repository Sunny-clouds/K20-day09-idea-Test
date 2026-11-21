package com.onik.demo._04_for;


public class Test04_03 {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    System.out.println(i + "时" + j + "分" + k + "秒");
                }
            }
        }

    }

}
