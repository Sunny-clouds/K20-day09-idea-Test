package com.onik.Text.c9;

import java.time.LocalDate;

/**
 * C9. 批量统计有效运单：失败行输出行号与原因，成功行输出结果，最后统计有效行
 */
public class C9 {
    public static void main(String[] args) {
        String[] lines = {
                "  SF1001 , 2 , 2026-11-17 ",
                "SF1002,0,2026-11-17",
                "SF1003,5,",
                "SF1004,1,2026-12-31"
        };

        int valid = 0;
        for (int i = 0; i < lines.length; i++) {
            String row = "第" + (i + 1) + "行 ";
            String[] parts = lines[i].split(",", -1);   // 保留尾部空列，才能发现日期列缺失

            if (parts.length != 3) {
                System.out.println(row + "列数不足:" + parts.length);
                continue;                               // 失败就跳过本行
            }

            String id = parts[0].trim();
            String countText = parts[1].trim();
            String dateText = parts[2].trim();
            if (id.isEmpty() || countText.isEmpty() || dateText.isEmpty()) {
                System.out.println(row + "字段缺失");
                continue;
            }

            int count;
            try {
                count = Integer.parseInt(countText);
            } catch (NumberFormatException e) {
                System.out.println(row + "件数格式错误:" + countText);
                continue;
            }
            if (count <= 0) {
                System.out.println(row + "件数非法:" + count);
                continue;
            }

            LocalDate next = LocalDate.parse(dateText).plusDays(1);
            System.out.println(row + "运单号=" + id + ", 件数=" + count + ", 次日=" + next);
            valid++;                                    // 计数只在成功路径加一次
        }

        System.out.println("有效行 " + valid);
    }
}
