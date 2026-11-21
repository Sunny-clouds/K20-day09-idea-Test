package com.onik.Text.c8;

/**
 * C8. 拆分结果与常量比较：split 产生的是新的字符串对象
 */
public class C8 {
    public static void main(String[] args) {
        String[] parts = "SF9001,已签收".split(",");
        String status = parts[1];

        System.out.println(status.equals("已签收"));    // true ：内容相同
        System.out.println(status == "已签收");         // false：split 新建对象，地址不同

        System.out.println("业务判断用 equals，== 只能判断是不是同一个对象。");
    }
}
