package com.onik.Text.b8;

import java.time.LocalDate;

/**
 * B8. 账单到期日加一天（跨月）
 */
public class B8 {
    public static void main(String[] args) {
        LocalDate due = LocalDate.parse("2026-11-30");   // ISO 格式 yyyy-MM-dd
        LocalDate next = due.plusDays(1);                // plusDays 返回新对象，必须接住

        System.out.println(due);    // 2026-11-30
        System.out.println(next);   // 2026-12-01，自动跨月
    }
}
