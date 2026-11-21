package com.onik.demo._02_Test;

public class Test01 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i : arr) {
            sum += i;
            System.out.println("第 " + i + " 个元素是: " + i);
        }
        System.out.println("Sum: " + sum);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println("第 " + i + " 个元素是: " + arr[i]);
        }
        System.out.println("Sum: " + sum);
    }
}
