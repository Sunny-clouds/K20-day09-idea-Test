package com.onik.c3;

/**
 * C3. 构造器调用构造器
 * 单参构造器用 this(id, 3) 委托两参构造器，避免调用方每次传默认值。
 */
public class C3 {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("T-1");       // 委托 -> priority 默认 3
        Ticket t2 = new Ticket("T-2", 1);

        System.out.println(t1.id + " " + t1.priority);   // T-1 3
        System.out.println(t2.id + " " + t2.priority);   // T-2 1
    }
}

class Ticket {
    String id;
    int priority;

    public Ticket(String id) {
        this(id, 3);      // this(...) 必须是构造器里的第一条语句
    }

    public Ticket(String id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}
