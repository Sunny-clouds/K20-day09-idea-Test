package com.onik.Exam;

import java.time.LocalDate;

/**
 * 设备检测记录清洗：每行格式「设备编号,温度,检测日期」
 * 处理顺序：列数校验 -> 空字段校验 -> 温度转换与范围校验 -> 日期解析取次日
 */
public class Text02 {
    public static void main(String[] args) {
        String[] lines = {
                " D-07, 36,2027-05-06 ",
                "E-12,28,2027-12-31",
                "F-03,41",
                "G-09,  ,2027-06-01",
                // 异常类名：java.lang.NumberFormatException
                // 报错消息要点：字符串 "abc" 无法解析为int类型，即温度列不是合法数字
                // 该行在本文件中的行号：19
                "H-05,abc,2027-06-02"
        };

        for (String line : lines) {
            // split 时必须带 -1，保留末尾空列
            String[] cols = line.split(",");
            if (cols.length != 3) {
                System.out.println("列数不足:" + line);
                continue;
            }

            // 三列分别 trim，任一列为空则字段缺失
            String device = cols[0].trim();
            String tempStr = cols[1].trim();
            String dateStr = cols[2].trim();
            if (device.isEmpty() || tempStr.isEmpty() || dateStr.isEmpty()) {
                System.out.println("字段缺失:" + line);
                continue;
            }

            // 温度转 int 并校验 -20 ~ 60
            int temp = Integer.parseInt(tempStr);
            if (temp < -20 || temp > 60) {
                System.out.println("温度无效:" + line);
                continue;
            }

            LocalDate date = LocalDate.parse(dateStr);
            LocalDate nextDay = date.plusDays(1);

            System.out.println("设备:" + device + "｜温度:" + temp + "｜次日:" + nextDay);
        }
    }
}
