package com.onik.b4;

/**
 * B4. 用 getter 读取字段
 * 字段 private，外部只能通过 getter 读取。
 */
public class B4 {
    public static void main(String[] args) {
        Bill bill = new Bill(2755);
        System.out.println("金额 " + bill.getAmountCents());
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
