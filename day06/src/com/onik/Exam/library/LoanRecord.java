package com.onik.Exam.library;

import java.time.LocalDate;

/**
 * 借阅记录：读者编号、书名、借阅日期、应还日期、逾期天数、罚金
 */
public class LoanRecord {

    private String readerId;
    private String bookName;
    private LocalDate borrowDate;
    private LocalDate dueDate;
    private int overdueDays;
    private int fine;

    /**
     * 构造器接收前四项，overdueDays 与 fine 在构造器中计算
     *
     * @param today 结算日固定为 2027-03-15
     */
    public LoanRecord(String readerId, String bookName, LocalDate borrowDate, LocalDate today) {
        this.readerId = readerId;
        this.bookName = bookName;
        this.borrowDate = borrowDate;
        this.dueDate = borrowDate.plusDays(30);
        // 逾期天数 = 相差天数 - 30，大于 0 才计罚金
        this.overdueDays = daysFrom(borrowDate, today) - 30;
        if (this.overdueDays > 0) {
            // 每天 2 元，单笔封顶 20 元，取两者较小值
            this.fine = Math.min(this.overdueDays * 2, 20);
        } else {
            this.overdueDays = 0;
            this.fine = 0;
        }
    }

    /**
     * 用 while 配合 equals 与 plusDays(1) 逐日前进，返回 from 到 to 相差的天数
     */
    public static int daysFrom(LocalDate from, LocalDate to) {
        int days = 0;
        LocalDate cursor = from;
        while (!cursor.equals(to)) {
            cursor = cursor.plusDays(1);
            days++;
        }
        return days;
    }

    public String getReaderId() {
        return readerId;
    }

    public String getBookName() {
        return bookName;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public int getOverdueDays() {
        return overdueDays;
    }

    public int getFine() {
        return fine;
    }
}
