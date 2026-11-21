package com.onik.Demo02;

public class Demo03 {
    public static void main(String[] args) {

        int a = 123;
        double b = 12.3;

        String aa = String.valueOf(a);
        String bb = String.valueOf(b);
        System.out.println("长度是" + aa.length() + "，内容是" + aa);
        System.out.println("长度是" + bb.length() + "，内容是" + bb);

        Integer aaa = Integer.parseInt(aa);
        Double bbb = Double.parseDouble(bb);
        System.out.println("内容是" + (aaa + 1));
        System.out.println("内容是" + (bbb + 1));


    }
}
