package com.onik.Text.b10;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 * B10. 认出异常来自哪一行：两个字段同时写错，分两次单独运行
 */
public class B10 {
    public static void main(String[] args) {
        // 第一处：件数把数字 0 写成了字母 O
        try {
            int count = Integer.parseInt("1O");
            System.out.println(count);
        } catch (NumberFormatException e) {
            report(e);
        }

        // 第二处：发货日用了斜杠，不是 ISO 的横线
        try {
            LocalDate date = LocalDate.parse("2026/11/17");
            System.out.println(date);
        } catch (DateTimeParseException e) {
            report(e);
        }
    }

    /** 打印异常类名、消息要点，以及在自己代码里抛出的行号 */
    static void report(Throwable e) {
        System.out.println("异常类名：" + e.getClass().getName());
        System.out.println("消息要点：" + e.getMessage());
        System.out.println("排查位置：" + ownPlace(e));
        System.out.println("----");
    }

    /** 栈顶往往是 JDK 内部的类（parseInt、parse 在里面构造异常），要往下找第一行自己包里的代码 */
    static String ownPlace(Throwable e) {
        for (StackTraceElement element : e.getStackTrace()) {
            if (element.getClassName().startsWith("com.onik")) {
                return element.getFileName() + " 第 " + element.getLineNumber() + " 行";
            }
        }
        return "没找到自己代码里的行号";
    }
}
