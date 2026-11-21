package com.onik.Text.c4;

/**
 * C4. 运单号只有空格：length 不为 0，但 trim 后为空
 */
public class C4 {
    public static void main(String[] args) {
        String[] parts = "   ,2,2026-11-17".split(",", -1);

        System.out.println("列数:" + parts.length);   // 列数:3

        String id = parts[0].trim();                  // "   " -> ""
        if (id.isEmpty()) {
            System.out.println("运单号缺失");           // 不再转换件数和日期
            return;
        }

        System.out.println("运单号:" + id);
        System.out.println("件数:" + Integer.parseInt(parts[1].trim()));
    }
}
