package cn.itcast.day09.demo11;

import java.util.ArrayList;

/**
 * 2018-10-2
 *
 */

public class MainRedPacket {

    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);

        Member one = new Member("群员A", 0);
        Member two = new Member("群员B", 0);
        Member three = new Member("群员C", 0);

        manager.show(); // 显示姓名+余额
        one.show();
        two.show();
        three.show();
        System.out.println("===================");

        // 群主发20元，分3个红包
        ArrayList<Integer> redList = manager.send(20,3);
        // 3个群员收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        // 显示收完红包后的姓名+余额
        manager.show(); // 100-20=80
        // 6, 6, 8
        one.show();
        two.show();
        three.show();

    }

}
