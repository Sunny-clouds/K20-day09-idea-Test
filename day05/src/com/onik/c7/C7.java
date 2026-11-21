package com.onik.c7;

/**
 * C7. 数组里的空对象统计
 * 用 devices[i] == null 区分空位，分别计数，避免空指针。
 */
public class C7 {
    public static void main(String[] args) {
        Device[] devices = new Device[4];
        devices[0] = new Device();
        devices[2] = new Device();
        devices[3] = new Device();
        // 1 号留空(null)

        int registered = 0;
        int empty = 0;
        for (int i = 0; i < devices.length; i++) {
            if (devices[i] == null) {
                empty++;
            } else {
                registered++;
            }
        }

        System.out.println("已登记 " + registered + " 台");   // 已登记 3 台
        System.out.println("未登记 " + empty + " 台");         // 未登记 1 台
    }
}

class Device {
}
