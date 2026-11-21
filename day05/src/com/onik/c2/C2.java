package com.onik.c2;

/**
 * C2. 完整封装一个对象
 * 字段全部 private，修改只能通过 addPoints，负数或会变负的操作被拒绝。
 */
public class C2 {
    public static void main(String[] args) {
        Member m = new Member("M001", 100);
        m.addPoints(50);      // 100 -> 150
        m.addPoints(-200);    // 结果 -50 < 0，被拒绝
        System.out.println("最终积分 " + m.getPoints());   // 150
    }
}

class Member {
    private String id;
    private int points;

    public Member(String id, int points) {
        this.id = id;
        this.points = points;
    }

    public String getId() {
        return id;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int delta) {
        if (delta < 0 || points + delta < 0) {
            System.out.println("积分变更被拒绝");
            return;
        }
        points += delta;
    }
}
