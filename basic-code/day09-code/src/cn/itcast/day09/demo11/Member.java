package cn.itcast.day09.demo11;

import java.util.ArrayList;
import java.util.Random;

/**
 * 2018-10-2
 *
 */

public class Member extends User { // 群员

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        // 从多个红包中随机抽取一个给自己，随机获取集合当中的索引编号
        int index = new Random().nextInt(list.size());
        // 根据，从集合当中删除，并且得到被删除的红包给自己
        int delta = list.remove(index);
        // 当前成员本来有多少钱
        int money = super.getMoney();
        // 加法，并且重新设置金额
        super.setMoney(money + delta);
    }

}
