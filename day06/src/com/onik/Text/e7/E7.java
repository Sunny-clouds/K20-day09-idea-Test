package com.onik.Text.e7;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 * E7. 把一行文本封装成对象：解析失败统一返回 null，调用方判空
 */
public class E7 {
    public static void main(String[] args) {
        WaybillRecord ok = WaybillRecord.parse(" SF1001 , 2 , 2026-11-17 ");
        System.out.println(ok == null ? "解析失败" : ok.show());

        WaybillRecord bad = WaybillRecord.parse("SF1002,2");   // 缺列
        System.out.println(bad == null ? "解析失败（返回 null，调用方只需判空）" : bad.show());
    }
}

class WaybillRecord {
    String id;            // 运单号
    int count;            // 件数
    LocalDate sendDate;   // 发货日

    /** 列数不对、字段为空、件数或日期不合法时返回 null */
    static WaybillRecord parse(String line) {
        if (line == null) {
            return null;
        }
        String[] parts = line.split(",", -1);
        if (parts.length != 3) {
            return null;
        }

        String id = parts[0].trim();
        String countText = parts[1].trim();
        String dateText = parts[2].trim();
        if (id.isEmpty() || countText.isEmpty() || dateText.isEmpty()) {
            return null;
        }

        try {
            int count = Integer.parseInt(countText);
            if (count <= 0) {
                return null;
            }
            WaybillRecord record = new WaybillRecord();
            record.id = id;
            record.count = count;
            record.sendDate = LocalDate.parse(dateText);
            return record;
        } catch (NumberFormatException | DateTimeParseException e) {
            return null;
        }
    }

    String show() {
        return "运单=" + id + ";件数=" + count + ";发货日=" + sendDate;
    }
}
