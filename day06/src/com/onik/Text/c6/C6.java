package com.onik.Text.c6;

import java.time.LocalDate;

/**
 * C6. 闰日加一天：2024-02-28 的下一天是 2 月 29 日，交给 LocalDate 算
 */
public class C6 {
    public static void main(String[] args) {
        LocalDate plan = LocalDate.parse("2024-02-28");
        LocalDate next = plan.plusDays(1);

        System.out.println(plan);   // 2024-02-28
        System.out.println(next);   // 2024-02-29（2024 是闰年，不要手工拼字符串）
    }
}
