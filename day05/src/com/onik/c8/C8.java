package com.onik.c8;

/**
 * C8. 构造器重载与默认状态
 * 单参构造器用 this(title, "待审核") 复用两参构造器，默认值只写一遍。
 */
public class C8 {
    public static void main(String[] args) {
        Content c1 = new Content("标题A");
        Content c2 = new Content("标题B", "已发布");

        System.out.println(c1.title + " " + c1.status);   // 标题A 待审核
        System.out.println(c2.title + " " + c2.status);   // 标题B 已发布
    }
}

class Content {
    String title;
    String status;

    public Content(String title) {
        this(title, "待审核");   // 委托给两参构造器
    }

    public Content(String title, String status) {
        this.title = title;
        this.status = status;
    }
}
