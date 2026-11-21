package com.onik.Text;

public class A01_01 {

    /**
     * A01
     * @param i
     */
    public void stopCar(int i){
        if (i <= 30 && i > 0) {
            System.out.println("停了: " + i + "分钟，收费3元");
        } else if (i > 30 && i <= 60) {
            System.out.println("停了: " + i + "分钟，收费6元");
        } else if (i > 60 && i <= 120) {
            System.out.println("停了: " + i + "分钟，收费9元");
        } else {
            System.out.println("停了: " + i + "分钟，收费0元");
        }
    }

    /**
     * A02
     * @param weight
     * @param min
     * @param max
     * @return
     */
    public boolean inRange(double weight, double min, double max){
        return weight >= min && weight <= max;
    }

    /**
     * A03
     * @param seats
     * @param take
     * @return
     */
    public int remaining(int seats,int take){
        return seats - take;
    }

    /**
     * A05
     * @param hours
     * @return
     */
    public int sumMinutes(int[] hours){
        int sum = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= 0) {
                sum += hours[i];
            }
        }
        return sum;
    }

    /**
     * A06
     * @param user
     * @return
     */
    public int avg(int user){
        if (user > 0){
            int i = user * 2;
            if (i % 12 == 0) {
                return i / 12;
            }else{
                return i / 12 + 1;
            }
        }else{
            return 0;
        }
    }

    /**
     * A07
     * @param min
     * @param max
     * @return
     */
    public boolean isEven(int min,int max){
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        if((max - min) >= 15){
            return true;
        }
        return false;
    }

    /**
     * A08
     * @param points
     * @param threshold
     * @return
     */
    public int eligibility(int points,int threshold){
        if (points >= threshold) {
            return 1;
        } else if (points < threshold && points >= 0) {
            return 0;
        } else {
            return -1;
        }
    }

    /**
     * A09
     * @param a
     * @param b
     * @return
     */
    public int sum(int a, int b){
        if (b >= 8) {
            a += b / 8;
            b -= b / 8 * 8;
        }
        return a * 8 + b;
    }

    /**
     * A10
     * @param late
     * @return
     */
    public static int penalty(int late) {
        if (late > 0) {
            return late * 2;
        }
        return 0;
    }

}
