package com.onik.Text.e2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

/**
 * E2. 从文件批量读取运单行，复用 C9 的校验逻辑
 * 运行目录：day06（IDEA 中默认就是模块目录），文件为 waybills.txt
 */
public class E2 {
    public static void main(String[] args) {
        Path path = Paths.get(args.length > 0 ? args[0] : "waybills.txt");

        List<String> lines;
        try {
            lines = Files.readAllLines(path);   // 一次读入全部行，受检异常必须处理
        } catch (NoSuchFileException e) {
            System.out.println("文件不存在");    // 输出提示后正常结束，程序不中断
            return;
        } catch (IOException e) {
            System.out.println("读取失败:" + e.getMessage());
            return;
        }

        int valid = 0;
        for (int i = 0; i < lines.size(); i++) {
            String row = "第" + (i + 1) + "行 ";
            String result = check(lines.get(i));
            if (result == null) {
                continue;                       // 空行不计入
            }
            System.out.println(row + result);
            if (result.startsWith("运单号=")) {
                valid++;
            }
        }
        System.out.println("有效条数 " + valid);
    }

    /** 校验并清洗一行，返回结果描述；空行返回 null */
    static String check(String line) {
        if (line == null || line.trim().isEmpty()) {
            return null;
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
            LocalDate next = LocalDate.parse(dateText).plusDays(1);
            return "运单号=" + id + ", 件数=" + count + ", 次日=" + next;
        } catch (Exception e) {
            return "日期格式错误:" + dateText;
        }
    }
}
