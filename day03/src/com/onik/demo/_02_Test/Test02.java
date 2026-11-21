package com.onik.demo._02_Test;

public class Test02 {
    public static void main(String[] args) {


        double[] arr = {60,65.2, 70.5, 59.8, 72.3, 80.4};
        double sum = 0;
        int count = 0;
        for (double i : arr) {
            if(i >= 60){
                sum += i;
                count++;
            }
        }
        System.out.println("及格的平均分: " + sum / count);
        System.out.println("及格的总分: " + sum);
        System.out.println("及格的人数: " + count);
    }
}
