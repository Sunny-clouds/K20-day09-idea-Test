package com.onik.demo._01_shuzu;

public class Test02 {

    public static void main(String[] args) {
        // 1: 创建一个整数数字,保存 3,6,9
        int[] arr = {3,6,9}; // 这一行代码,虽然语法上没有写 new,本质上依然 new 了,只是语法省略了而已,所以等号右边是在 堆内存中开启了一块空间,然后把空间的地址值赋值给了arr
        // 2:复制一份数组,对1索引位置的元素进行修改
        int[] arr2 = arr; // 仅仅是把 arr记录的地址值复制一份,交给arr2,但是堆内存中没有开启新的空间,arr和arr2都是指向同一个位置
        // 对1索引位置的元素进行修改
        arr2[1] = 666;
        // 观察老数组和新数组的1索引位置的元素的区别
        System.out.println(arr[1]); // 666
        System.out.println(arr2[1]); // 666

        System.out.println(arr); // 观察两个变量记录的是否是同一个地址值
        System.out.println(arr2);
    }
}
