package com.onik.Text.c10;

/**
 * C10. 定位金额字段的格式错误：列数与非空都通过，件数却写成小数
 */
public class C10 {
    public static void main(String[] args) {
        String[] parts = "SF1005,12.5,2026-11-17".split(",", -1);

        // 列数检查、非空检查都能通过，问题出在转换这一步
        if (parts.length != 3) {
            System.out.println("列数不足:" + parts.length);
            return;
        }

        try {
            int count = Integer.parseInt(parts[1].trim());   // 异常从这里抛出
            System.out.println("件数:" + count);
        } catch (NumberFormatException e) {
            System.out.println("异常类名：" + e.getClass().getName());
            System.out.println("异常消息：" + e.getMessage());
            System.out.println("抛出位置：" + ownPlace(e));
            System.out.println("先检查第 2 列（件数）：消息里的 \"12.5\" 就是这一列的原值，小数要用 BigDecimal 或先去掉小数点。");
        }
    }

    /** 栈顶是 JDK 内部构造异常的类，要往下找第一行自己包里的代码 */
    static String ownPlace(Throwable e) {
        for (StackTraceElement element : e.getStackTrace()) {
            if (element.getClassName().startsWith("com.onik")) {
                return element.getFileName() + " 第 " + element.getLineNumber() + " 行";
            }
        }
        return "没找到自己代码里的行号";
    }
}
