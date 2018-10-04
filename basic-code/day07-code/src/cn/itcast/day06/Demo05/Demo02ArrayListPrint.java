package cn.itcast.day06.Demo05;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 2018-9-30
 *
 * 题目：
 * 定义指定i以格式打印集合的方法（ArraryList类型作为参数）。使用{}包围集合，使用@分隔每个元素
 * 格式参照：{元素1@元素2@元素3}
 *
 * System.out.pirint(list); [10, 20, 30]
 * printArratList(list);    {10@20@30}
 *
 */

public class Demo02ArrayListPrint {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Cat");
        list.add("Dog");
        list.add("Pig");
        System.out.println(list);

        printArrayList(list);

    }

    /**
     * 定义方法的三要素
     * 返回值类型：只进行打印所以使用void
     * 方法名称：printArraryList
     * 参数列表：ArrayList
     */
    public static void printArrayList(ArrayList<String> list) {
        // {10@20@30}
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.println(list.get(i) + "}");
            } else {
                System.out.print(list.get(i) + "@");
            }
        }

    }


}
