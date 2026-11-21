package com.onik.Text.b5;

/**
 * B5. 保留末尾空列：split 默认会丢掉尾部空串
 */
public class B5 {
    public static void main(String[] args) {
        String line = "超时,破损,";

        // 第二个参数给负数：保留尾部空列（写 split(",") 只会得到 2 列）
        String[] parts = line.split(",", -1);

        System.out.println(parts.length);           // 3
        System.out.println("[" + parts[2] + "]");   // []
    }
}
