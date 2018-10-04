package cn.itcast.day06.Demo04;

import java.util.ArrayList;

/**
 * 2018-9-30
 */

public class Demo04ArraryListEach {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Cat");
        list.add("Cat");
        list.add("Dog");
        list.add("Dog");

        // 便利集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
