package cn.itcast.day11.demo07;

import java.util.ArrayList;
import java.util.List;

/**
 * 2018-10-4
 *
 * java.util.List正是ArrayList所实现的接口
 *
 */

public class DemoInterface {

    public static void main(String[] args) {
        // 左边是接口名称，右边是实现类名称，这就是多态写法
        List<String> list = new ArrayList<>();

        List<String> reault = addNames(list);
        for (int i = 0; i < reault.size(); i++) {
            System.out.println(reault.get(i));
        }
    }

    public static List<String> addNames(List<String> list) {
        list.add("7kb");
        list.add("菜菜");
        list.add("嘟嘟");
        list.add("Miko");
        return list;
    }

}
