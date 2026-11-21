package com.onik.Text.b4;

/**
 * B4. 拆分巡检记录的三个字段（设备编号,巡检结论,巡检日期）
 */
public class B4 {
    public static void main(String[] args) {
        String line = "P-07,正常,2026-11-17";
        String[] parts = line.split(",");   // 按英文逗号拆分

        System.out.println(parts.length);   // 3
        System.out.println(parts[0] + "|" + parts[1] + "|" + parts[2]);
    }
}
