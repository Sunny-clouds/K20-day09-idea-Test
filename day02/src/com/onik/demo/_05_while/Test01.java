package com.onik.demo._05_while;

public class Test01 {
    public static void main(String[] args) {


        int i = 0;
        while (i < 50) {
            if (i == 4){
                break;
            }
            System.out.println(i);
            ++i;
        }

    }
}
