package com.onik.Text.b9;

import java.time.LocalDate;

/**
 * B9. 工单截止日加一天（跨年）
 */
public class B9 {
    public static void main(String[] args) {
        LocalDate deadline = LocalDate.parse("2026-12-31");
        LocalDate next = deadline.plusDays(1);

        System.out.println(deadline);   // 2026-12-31
        System.out.println(next);       // 2027-01-01，自动跨年
    }
}
