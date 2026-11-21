package com.onik.demo._02_Test;

public class Test04 {
    public static void main(String[] args) {
        int[] arr = {9,4,5,6,8,1,3,2,10,7};

        for (int j = arr.length - 1; j > 0; j--) {   // j 是这一趟的右边界
            for (int i = 0; i < j; i++) {            // 只扫到 j-1，因为要访问 arr[i+1]
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
