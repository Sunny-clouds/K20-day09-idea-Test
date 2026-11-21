package com.onik.Text;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Test01 {

    /*

          需求：键盘输入一个会员的充值日期和充值的天数
          计算出截至到今天为止，会员还剩余的天数或已经过期的天数

          分析：
            1、从键盘获取充值日期（只能是字符串形式）和充值的天数
            2、转换为日期对象（JDK8的LocalDate类）
            3、计算截至到今天为止，会员还剩余的天数或已经过期的天数
            4、输出结果
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入会员的充值日期（格式：yyyy-MM-dd）：");
        String date = scanner.next();
        System.out.println("请输入会员的充值天数：");
        int days = scanner.nextInt();
        //创建日期格式化工具
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(date, formatter);

        // 到期日 = 充值日 + 充值天数（plusDays 返回新对象！）
        LocalDate expireDate = localDate.plusDays(days);
        LocalDate today = LocalDate.now();

        if (expireDate.isAfter(today)) {
            // 未过期：今天 → 到期日 之间的天数
            long remain = ChronoUnit.DAYS.between(today, expireDate);
            System.out.println("会员的充值未过期，剩余天数为：" + remain + " 天");
            System.out.println("会员的充值未过期，剩余月数为：" + ChronoUnit.MONTHS.between(today, expireDate));
        } else {
            // 已过期（含当天到期）：到期日 → 今天 之间的天数
            long expired = ChronoUnit.DAYS.between(expireDate, today);
            System.out.println("会员的充值已过期，过期天数为：" + expired + " 天");
            System.out.println("会员的充值已过期，过期月数为：" + ChronoUnit.MONTHS.between(expireDate,today));
            System.out.println("会员的充值已过期，过期年数为：" + ChronoUnit.YEARS.between(expireDate,today));
        }

    }
}
