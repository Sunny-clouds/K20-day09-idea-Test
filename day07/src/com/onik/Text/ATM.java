package com.onik.Text;

import java.util.Random;
import java.util.Scanner;

public class ATM {
    private final Scanner scanner = new Scanner(System.in);
    private final User[] user = new User[5];
    public void start() {
        System.out.println("----进入取款机----");
        while (true){
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.退出");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("登录");
                    User user1 = login();
                    showMenu(user1);
                    break;
                case 2:
                    System.out.println("注册");
                    register();
                    break;
                case 3:
                    System.out.println("退出");
                    return;
            }
        }
    }

    /**
     * 显示菜单
     * @param user
     */
    private void showMenu(User user) {
        System.out.println("进入取款机菜单");
        while (true){
            System.out.println("1.取款");
            System.out.println("2.存款");
            System.out.println("3.转账");
            System.out.println("4.查询余额");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("取款");
                    getMoney(user);
                    break;
                case 2:
                    System.out.println("存款");
                    saveMoney(user);
                    break;
                case 3:
                    System.out.println("转账");
                    transferMoney(user);
                    break;
                case 4:
                    System.out.println("当前余额为：" + user.getMoney());
                    break;
                case 5:
                    System.out.println("请输入新密码");
                    String newPassword = scanner.next();
                    user.setPassword(newPassword);
                    System.out.println("密码修改成功");
                    break;
                case 6:
                    System.out.println("退出");
                    return;
            }
        }
    }

    /**
     * 转账
     * @param user
     */
    private void transferMoney(User user) {
        System.out.println("请输入接收转账的账号");
        Long id = scanner.nextLong();
        User x = getNameById(id);
        if (x == null) {
            System.out.println("账号不存在");
            return;
        }
        System.out.println("请输入他的姓氏：*" + x.getName().charAt(1));
        String surname = scanner.next();
        if (!surname.equals(x.getName().charAt(1))) {
            System.out.println("账号不存在");
            return;
        }
        System.out.println("请输入转账金额");
        double transfer = scanner.nextDouble();
        if(transfer < 0){
            System.out.println("转账金额必须大于0");
        }else if (transfer > user.getMoney()){
            System.out.println("余额不足");
        } else if (transfer > user.getLimit()) {
            System.out.println("转账金额不能超过" + user.getLimit());
        } else {
            user.setMoney(user.getMoney() - transfer);
            System.out.println("转账成功，当前余额为：" + user.getMoney());
        }
    }

    /**
     * 根据账号获取用户
     * @param id
     * @return
     */
    private User getNameById(Long id) {
        for (int i = 0; i < user.length; i++) {
            if(user[i] != null && user[i].getId() == id){
                return user[i];
            }
        }
        return null;
    }

    /**
     * 存款
     * @param user
     */
    private void saveMoney(User user) {
        System.out.println("请输入存款金额");
        double deposit = scanner.nextDouble();
        if(deposit > 0){
            user.setMoney(user.getMoney() + deposit);
            System.out.println("存款成功，当前余额为：" + user.getMoney());
        } else {
            System.out.println("存款金额必须大于0");
        }
    }

    /**
     * 取款
     * @param user
     */
    private void getMoney(User user) {
        System.out.println("请输入取款金额");
        double withdraw = scanner.nextDouble();
        if(user.getMoney() < withdraw){
            System.out.println("余额不足");
        } else if (withdraw > user.getLimit()) {
            System.out.println("取款金额不能超过" + user.getLimit());
        } else if (withdraw <= 0) {
            System.out.println("取款金额必须大于0");
        }else {
            user.setMoney(user.getMoney() - withdraw);
            System.out.println("取款成功，当前余额为：" + user.getMoney());
        }
    }

    /**
     * 登录
     * @return
     */
    private User login() {
        while (true){
            System.out.println("请输入账号");
            Long id = scanner.nextLong();
            System.out.println("请输入密码");
            String password = scanner.next();
            for (int i = 0; i < user.length; i++) {
                if(user[i] != null && user[i].getId() == id && user[i].getPassword().equals(password)){
                    System.out.println("登录成功");
                    return user[i];
                }
            }
            System.out.println("账号或密码错误");
        }
    }

    /**
     * 注册
     */
    private void register() {
        System.out.println("请输入用户名");
        String name = scanner.next();
        System.out.println("请输入密码");
        String password = scanner.next();
        System.out.println("请输入确认密码");
        String confirmPassword = scanner.next();
        while (!password.equals(confirmPassword)){
            System.out.println("两次输入的密码不一致，请重新输入");
            System.out.println("请输入密码");
            password = scanner.next();
            System.out.println("请输入确认密码");
            confirmPassword = scanner.next();
        }
        System.out.println("请输入手机号");
        int phone = scanner.nextInt();
        System.out.println("请输入初始余额");
        double money = scanner.nextDouble();
        Long id = getRandom();
        User user = new User(name,10000,id,password,money,phone);
        for (int i = 0; i < this.user.length; i++) {
            if(this.user[i] == null){
                this.user[i] = user;
                break;
            } else if (i == this.user.length - 1) {
                System.out.println("数据库已满");
                return;
            }
        }
        System.out.println("注册成功,你的账号是:" + id);
    }

    /**
     * 生成随机账号
     */
    private Long getRandom() {
        Random random = new Random();
        while (true){
            long id = random.nextLong(10L, 99L);
            for (int i = 0; i < user.length; i++) {
                if(user[i] != null && user[i].getId() != id){
                    return id;
                }
            }
            return id;
        }
    }
}
