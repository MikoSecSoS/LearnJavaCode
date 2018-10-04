package cn.itcast.day09.demo11;

/**
 * 2018-2-10
 *
 */

public class User {

    private String name; // 姓名
    private int money; // 余额，当前用户用的钱数

    public User() {

    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    // 显示当前用户有多少钱
    public void show(){
        System.out.println("Name:" + name + " " + "Money:" + money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
