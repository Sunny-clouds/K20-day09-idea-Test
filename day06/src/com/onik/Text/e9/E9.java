package com.onik.Text.e9;

import java.util.ArrayList;
import java.util.List;

/**
 * E9. 最小 CSV 解析器：引号内的逗号不作分隔符，引号本身不进结果
 * 输入："SF1001,加急","2","2026-11-17"
 */
public class E9 {
    public static void main(String[] args) {
        String line = "\"SF1001,加急\",\"2\",\"2026-11-17\"";
        String[] parts = parse(line);

        System.out.println("列数:" + parts.length);   // 3
        for (String part : parts) {
            System.out.println("[" + part + "]");
        }
    }

    /** 逐字符扫描，用布尔量记录是否在引号内 */
    static String[] parse(String line) {
        List<String> cells = new ArrayList<>();
        StringBuilder cell = new StringBuilder();
        boolean inQuotes = false;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == '"') {
                inQuotes = !inQuotes;             // 引号只切换状态，本身不写入结果
            } else if (c == ',' && !inQuotes) {
                cells.add(cell.toString());       // 只有引号外的逗号才是分隔符
                cell.setLength(0);                // 清空缓冲区，准备下一列
            } else {
                cell.append(c);
            }
        }
        cells.add(cell.toString());               // 最后一列循环里没被添加，要补上

        // 简化版：不支持字段内的双引号转义（"" 表示一个引号）
        return cells.toArray(new String[0]);
    }
}
