package com.onik.Text.e8;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 * E8. 边界用例表：先自己列 8 组输入与预期，再补 2 组，运行后核对是否一致
 */
public class E8 {
    public static void main(String[] args) {
        // {输入（null 单独标记）, 自己的预期, 用例来源}
        String[][] cases = {
                {null, "无对象，直接返回", "自己"},
                {"", "列数不足:1", "自己"},
                {"SF1006,   ,2026-11-17", "字段缺失", "自己：空格串 length 不为 0"},
                {"SF1006,2", "列数不足:2", "自己：缺列"},
                {"SF1006,2,", "字段缺失", "自己：尾部空列"},
                {"SF1006,a,2026-11-17", "件数格式错误:a", "自己：非数字"},
                {"SF1006,0,2026-11-17", "件数非法:0", "自己：件数为 0"},
                {"SF1006,1,2026-12-31", "次日:2027-01-01", "自己：跨年日期"},
                {"SF1006,2147483648,2026-11-17", "件数格式错误:2147483648", "AI补充：超出 int 范围"},
                {"SF1006,1,2026-13-45", "日期格式错误:2026-13-45", "AI补充：月份越界"},
        };

        System.out.println("输入 | 自己的预期 | 实际输出 | 是否一致 | 用例来源");
        for (String[] c : cases) {
            String input = c[0];
            String actual = check(input);
            boolean same = actual.equals(c[1]);
            System.out.println(show(input) + " | " + c[1] + " | " + actual
                    + " | " + (same ? "一致" : "不一致") + " | " + c[2]);
        }
    }

    /** 表格里怎么显示这一格：null 和 "" 要能区分开 */
    static String show(String line) {
        if (line == null) {
            return "null";
        }
        return "\"" + line + "\"";
    }

    /** 一行文本的完整清洗流程，返回结果描述 */
    static String check(String line) {
        if (line == null) {
            return "无对象，直接返回";
        }
        String[] parts = line.split(",", -1);
        if (parts.length != 3) {
            return "列数不足:" + parts.length;
        }

        String id = parts[0].trim();
        String countText = parts[1].trim();
        String dateText = parts[2].trim();
        if (id.isEmpty() || countText.isEmpty() || dateText.isEmpty()) {
            return "字段缺失";
        }

        int count;
        try {
            count = Integer.parseInt(countText);
        } catch (NumberFormatException e) {
            return "件数格式错误:" + countText;
        }
        if (count <= 0) {
            return "件数非法:" + count;
        }

        try {
            return "次日:" + LocalDate.parse(dateText).plusDays(1);
        } catch (DateTimeParseException e) {
            return "日期格式错误:" + dateText;
        }
    }
}
