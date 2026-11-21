package com.onik.Text.b2;

/**
 * B2. 三种“没填”的备注：null、空串 ""、空格串 "   "
 */
public class B2 {
    public static void main(String[] args) {
        describe(null);
        describe("");
        describe("   ");
    }

    static void describe(String remark) {
        // null 是“没有对象”，不能调用任何方法，必须先拦住
        if (remark == null) {
            System.out.println("null: 无对象");
            return;
        }
        // 空格串 length 不为 0，isEmpty 为 false，只有 trim 后才为空
        System.out.println("[" + remark + "] isEmpty=" + remark.isEmpty()
                + ", trim后为空=" + remark.trim().isEmpty());
    }
}
