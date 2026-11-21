package com.onik.c5;

/**
 * C5. 对象数组里的 null
 * 数组按固定长度创建，未赋值的位置默认是 null，遍历要先判空。
 */
public class C5 {
    public static void main(String[] args) {
        Bill[] bills = new Bill[3];   // 元素默认全部为 null
        bills[0] = new Bill(1200);
        bills[2] = new Bill(800);

        int sum = 0;
        int nullCount = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] != null) {
                sum += bills[i].getAmountCents();
            } else {
                nullCount++;
            }
        }

        System.out.println(sum);                        // 2000
        System.out.println("空位 " + nullCount + " 个");   // 空位 1 个
    }
}

class Bill {
    private int amountCents;

    public Bill(int amountCents) {
        this.amountCents = amountCents;
    }

    public int getAmountCents() {
        return amountCents;
    }
}
