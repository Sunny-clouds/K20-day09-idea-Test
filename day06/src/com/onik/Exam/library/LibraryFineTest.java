package com.onik.Exam.library;

import java.time.LocalDate;

/**
 * 逾期罚金结算：今天固定 2027-03-15，借阅期限 30 天，
 * 罚金每天 2 元、单笔封顶 20 元
 */
public class LibraryFineTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2027, 3, 15);

        String[] lines = {
                " R-101 , 数据结构 , 2027-01-20 ",
                "R-102,操作系统,2027-02-10",
                "R-103,计算机网络",
                "R-104,算法导论,2027-02-28"
        };

        // 合法记录存入数组，用于最后汇总
        LoanRecord[] records = new LoanRecord[lines.length];
        int count = 0;

        for (String line : lines) {
            // 按照逗号拆分字段
            String[] cols = line.split(",", -1);
            if (cols.length != 3) {
                System.out.println("列数不足:" + line);
                continue;
            }

            String readerId = cols[0].trim();
            String bookName = cols[1].trim();
            String dateStr = cols[2].trim();
            if (readerId.isEmpty() || bookName.isEmpty() || dateStr.isEmpty()) {
                System.out.println("字段缺失:" + line);
                continue;
            }

            LocalDate borrowDate = LocalDate.parse(dateStr);
            LoanRecord record = new LoanRecord(readerId, bookName, borrowDate, today);
            records[count++] = record;

            if (record.getOverdueDays() > 0) {
                System.out.println("读者:" + record.getReaderId()
                        + "|书名:" + record.getBookName()
                        + "|应还:" + record.getDueDate()
                        + "|逾期:" + record.getOverdueDays() + "天"
                        + "|罚金:" + record.getFine() + "元");
            } else {
                System.out.println("读者:" + record.getReaderId()
                        + "|书名:" + record.getBookName()
                        + "|应还:" + record.getDueDate()
                        + "|未逾期");
            }
        }

        // 遍历数组汇总：逾期人数与罚金合计
        int overdueCount = 0;
        int totalFine = 0;
        for (int i = 0; i < count; i++) {
            if (records[i].getOverdueDays() > 0) {
                overdueCount++;
                totalFine += records[i].getFine();
            }
        }
        System.out.println("逾期人数:" + overdueCount + ";罚金合计:" + totalFine + "元");
    }
}
