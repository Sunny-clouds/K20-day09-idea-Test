package com.onik.Text.e3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * E3. 计算两个日期的间隔（在途天数）
 */
public class E3 {
    public static void main(String[] args) {
        LocalDate send = LocalDate.parse("2026-11-17");   // 发货日
        LocalDate check = LocalDate.parse("2026-12-31");  // 对账日

        System.out.println(ChronoUnit.DAYS.between(send, check));   // 44：结束在开始之后，正数
        System.out.println(ChronoUnit.DAYS.between(check, send));   // -44：参数交换，方向反了

        System.out.println("符号含义：between(开始, 结束) 算的是“从前者到后者”，结束在前为正，反之为负，绝对值相同。");
    }
}
