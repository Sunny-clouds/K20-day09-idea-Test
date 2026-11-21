package com.onik.c9;

/**
 * C9. getter 返回数组引用
 * 直接返回内部数组会把数据交出去；返回副本才能守住封装。
 */
public class C9 {
    public static void main(String[] args) {
        System.out.println("--- 返回数组引用（封装被破坏）---");
        Order o1 = new Order(new int[]{100, 200});
        int[] ref = o1.getItems();      // 拿到的是内部数组本身
        ref[0] = 999;                   // 外部一改就绕过了封装
        System.out.println("内部 " + o1.getItems()[0]);   // 内部 999

        System.out.println("--- 返回副本（封装安全）---");
        Order o2 = new Order(new int[]{100, 200});
        int[] copy = o2.getItemsCopy(); // 拿到的是副本
        copy[0] = 999;                  // 改副本不影响内部数据
        System.out.println("内部 " + o2.getItems()[0]);   // 内部 100
    }
}

class Order {
    private int[] items;

    public Order(int[] items) {
        this.items = items;
    }

    // 危险：直接返回内部数组引用
    public int[] getItems() {
        return items;
    }

    // 安全：返回副本，外部改不到内部数据
    public int[] getItemsCopy() {
        int[] clone = new int[items.length];
        for (int i = 0; i < items.length; i++) {
            clone[i] = items[i];
        }
        return clone;
    }
}
