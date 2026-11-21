package com.onik.Text.c1;

import java.time.LocalDate;

/**
 * C1. 完整清洗一行运单：拆列 -> 判列数 -> 逐列 trim 判空 -> 转整数 -> 转日期
 */
public class C1 {
    public static void main(String[] args) {
        handle(" SF1234567890 , 3 , 2026-11-17 ");
    }

    static void handle(String line) {
        String[] parts = line.split(",", -1);

        // 1、长度检查必须在取下标之前
        if (parts.length != 3) {
            System.out.println("列数不足:" + parts.length);
            return;
        }

        // 2、每列 trim 后单独判空
        String id = parts[0].trim();
        String countText = parts[1].trim();
        String dateText = parts[2].trim();
        if (id.isEmpty() || countText.isEmpty() || dateText.isEmpty()) {
            System.out.println("字段缺失");
            return;
        }

        // 3、件数转整数，再判业务范围
        int count;
        try {
            count = Integer.parseInt(countText);
        } catch (NumberFormatException e) {
            System.out.println("件数格式错误:" + countText);
            return;
        }
        if (count <= 0) {
            System.out.println("件数非法:" + count);
            return;
        }

        // 4、发货日加一天，plusDays 的返回值要接住
        LocalDate next = LocalDate.parse(dateText).plusDays(1);

        System.out.println("运单号:" + id);
        System.out.println("件数:" + count);
        System.out.println("次日:" + next);
    }
}
