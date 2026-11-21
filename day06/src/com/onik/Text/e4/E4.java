package com.onik.Text.e4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * E4. 输出中文格式日期，同时保留 ISO 原格式作对照
 */
public class E4 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2026-11-17");

        // 模式字母区分大小写：yyyy 年、MM 月（两位数）、dd 日
        DateTimeFormatter cn = DateTimeFormatter.ofPattern("yyyy年MM月dd日");

        System.out.println(date);              // 2026-11-17（ISO 原格式）
        System.out.println(date.format(cn));   // 2026年11月17日
    }
}
