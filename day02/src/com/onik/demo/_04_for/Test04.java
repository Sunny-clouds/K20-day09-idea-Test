package com.onik.demo._04_for;

public class Test04 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            System.out.println("i = " + (i+1));
        }
        for (int i = 10; i > 0; i--){
            System.out.println("i = " + i);
        }

        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(i + "是偶数");
            }
        }

    }

}
