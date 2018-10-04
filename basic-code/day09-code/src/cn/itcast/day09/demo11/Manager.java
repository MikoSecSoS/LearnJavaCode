package cn.itcast.day09.demo11;

import java.util.ArrayList;

/**
 * 2018-10-2
 *
 */

public class Manager extends User { // 群主的类

    public Manager() {}

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        // 需要一个集合，用来储存若干红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        // 群主红包有多少钱
        int leftMoney = super.getMoney(); // 群主的余额
        if (totalMoney > leftMoney) {
            System.out.println("余额不足QAQ");
            return redList; // 返回空集合
        }

        // 在群主钱包里扣钱qwq，重新设置金额
        super.setMoney(leftMoney - totalMoney);

        // 发红包需要平均拆分count份
        int avg = totalMoney / count;
        int mod = totalMoney % count; // 余数，剩下的零头

        // 剩下的零头除不开，包在最后一个红包中
        // 把红包一个一个放到集合中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        // 最后一个红包
        int last = avg + mod;
        redList.add(last);

        return redList;
    }

}
