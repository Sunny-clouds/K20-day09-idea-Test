package com.onik.demo._02_Test;

public class Test06 {
    public static void main(String[] args) {
        int[] arr = {9,4,5,6,8,1,3,2,10,7};
        boolean flag;
        while (true) {
            flag = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false; // 如果发生交换，说明还没有有序
                }
            }
            if (flag) { // 如果没有发生交换，说明已经有序
                break;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
