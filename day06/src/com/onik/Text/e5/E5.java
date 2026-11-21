package com.onik.Text.e5;

/**
 * E5. 手机号脱敏：只保留前 3 位与后 4 位
 */
public class E5 {
    public static void main(String[] args) {
        System.out.println(mask("13800001111"));      // 138****1111
        System.out.println(mask(" 13800001111 "));    // 138****1111，先清洗再截
        System.out.println(mask("1380000"));          // 长度不足 11 位，原样返回
        System.out.println(mask("   "));               // 未登记
        System.out.println(mask(null));                // 未登记
    }

    static String mask(String mobile) {
        if (mobile == null) {
            return "未登记";
        }
        String value = mobile.trim();
        if (value.isEmpty()) {
            return "未登记";
        }
        if (value.length() < 11) {   // 先判长度，才能安全 substring
            return value;
        }
        return value.substring(0, 3) + "****" + value.substring(value.length() - 4);
    }
}
