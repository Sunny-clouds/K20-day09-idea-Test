package com.onik.Text.c3;

/**
 * C3. 末尾列为空：用保留尾部空列的拆分方式，才能发现第三列存在但没内容
 */
public class C3 {
    public static void main(String[] args) {
        String[] parts = "SF123,2,".split(",", -1);   // 写成 split(",") 只剩 2 列

        System.out.println("列数:" + parts.length);   // 列数:3

        String dateText = parts[2].trim();
        if (dateText.isEmpty()) {
            System.out.println("字段缺失");           // 输出后停止，不执行日期解析
            return;
        }

        System.out.println("次日:" + java.time.LocalDate.parse(dateText).plusDays(1));
    }
}
