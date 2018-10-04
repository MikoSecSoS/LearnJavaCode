package cn.itcast.day06.Demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * 2018-9-30
 *
 * 题目：
 * 生成六个1~33之之间的随机整数，添加到集合，并遍历集合。
 *
 * 思路：
 * 1. 需要储存6个数字，传建议各级和，<Integer>
 * 2. 循环六次，来产生6个随机数
 * 3. 循环内调用Random 中的 nextInt方法
 * 4. 把数字添加到集合中 add
 * 5. 便利集合：for size get
 *
 */

public class Demo01ArrayListRandom {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            list.add(new Random().nextInt(32) + 1);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }

}
