package com.onik.Text.e6;

/**
 * E6. 一条规则处理多种分隔符：逗号、分号、空格
 */
public class E6 {
    public static void main(String[] args) {
        String line = "SF1001, 2;2026-11-17";

        // split 的参数是正则；字符组 [ , ; \s ] 表示这些字符都算分隔符，+ 表示连续多个算一个
        String[] parts = line.trim().split("[,;\\s]+");

        System.out.println("列数:" + parts.length);   // 3
        System.out.println(parts[0] + "|" + parts[1] + "|" + parts[2]);
        System.out.println("注意：这种写法会把字段内部的分隔符也切掉，所以只适用于字段本身不含空格的场景。");
    }
}
