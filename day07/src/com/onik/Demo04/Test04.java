package com.onik.Demo04;

public class Test04 {
    public static void main(String[] args) {

        String str = "";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            str += sb.append(i);
        }
        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = new StringBuffer();
        sb2.append("123");
        sb3.append("123");
        System.out.println(sb2 == sb3);
        System.out.println(sb2.toString().equals(sb3.toString()));
    }
}
