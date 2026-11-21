package com.onik.Demo02;

import java.time.LocalDateTime;

public class Demo05 {
    public static void main(String[] args) {


        System.out.println(LocalDateTime.now());

        System.out.println(LocalDateTime.now().plusDays(1));
        System.out.println(LocalDateTime.now().plusHours(1));
        System.out.println(LocalDateTime.now().plusMinutes(1));
        System.out.println(LocalDateTime.now().plusSeconds(1));
        System.out.println(LocalDateTime.now().plusMonths(1));
        System.out.println(LocalDateTime.now().plusYears(1));
    }
}
