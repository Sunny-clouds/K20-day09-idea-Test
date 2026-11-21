package com.onik.Text.e1;

import java.time.LocalDate;

/**
 * E1. 用 StringBuilder 拼装一行日志
 */
public class E1 {
    public static void main(String[] args) {
        String id = "SF1001";
        int count = 2;
        LocalDate next = LocalDate.parse("2026-11-17").plusDays(1);

        StringBuilder sb = new StringBuilder();
        sb.append("运单=").append(id)
          .append(";件数=").append(count)
          .append(";次日=").append(next);   // append 返回自身，可以连续调用

        System.out.println(sb.toString());  // toString 只调用一次
        System.out.println("好处：全程共用一个字符数组；用 + 拼接时每加一段都要新建一个中间 String 对象。");
    }
}
