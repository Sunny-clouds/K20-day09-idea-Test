package com.onik.entity.Text;

public class A01 {
    public static void main(String[] args) {
        /**
         * A01
         */
        System.out.println("java开始了");
        //我改了代码
        System.out.println("我改了代码");

        /**
         * A02
         */
        //java: 需要<标识符>
        //java: 非法的类型开始

        /**
         * A03
         */
        String name = "张三";
        int score = 68;
        double time = 1.25;
        boolean isPass = false;
        System.out.println("姓名:" + name + ",分数:" + score + ",时间:" + time + ",是否通过:" + isPass);

        /**
         * A04
         */
        // 一个是int类型的变量，一个是String类型常量
        System.out.println(score);
        System.out.println("score");

        /**
         * A05
         */
        int a = 70;
        final int BONUS = 7;
        int b = a + BONUS;
        System.out.println(b);
        System.out.println(b - 2);

        /**
         * A06
         * 固定加减分数改BONUS
         */

        /**
         * A07
         */
        int aa = 11/3;
        int bb = 11%3;
        double cc = 11/3.0;
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);

        /**
         * A08
         */
        System.out.println("合计" + 4 + 6);
        System.out.println("合计" + (4 + 6));

        /**
         * A10
         */
        name = "小夏";
        time = 2.5;
        isPass = true;
        score = 64;
        System.out.println("姓名:" + name + ",固定加分:" + BONUS + ",分数:" + score + ",时间:" + time + ",是否通过:" + isPass);


        /**
         * B24
         */
        boolean isPasss = false;
        System.out.println("是否通过:" + isPasss);
        isPasss = true;
        System.out.println("是否通过:" + isPasss);
        System.out.println("isPasss");

        /**
         * C07
         */
        int pen = 9;
        int eraser = 4;
        int pencil = 5;
        System.out.println("总个数：" + pen * eraser + pencil);
        System.out.println("分：" + (pen * eraser + pencil) / 6 + "组");
    }
}
