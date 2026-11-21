package com.onik.Text;

public class User {

    private String name; // 姓名
    private Long id; // 卡号
    private String password; // 密码
    private Double money; // 金额
    private int limit; // 限额
    private int phone; // 电话

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public User() {
    }

    public User(String name, int limit, Long id, String password, Double money, int phone) {
        this.name = name;
        this.limit = limit;
        this.id = id;
        this.password = password;
        this.money = money;
        this.phone = phone;
    }
}
