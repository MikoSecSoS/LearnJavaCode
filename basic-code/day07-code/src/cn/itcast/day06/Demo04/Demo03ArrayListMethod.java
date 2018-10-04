package cn.itcast.day06.Demo04;

import java.util.ArrayList;

/**
 * 2018-9-30
 *
 * ArrayList当中常用的方法有：
 *
 * public boolean add(E e): 向集合中添加元素，参数的类型和泛型一致 返回值添加是否成功
 * 备注：对于ArrayList集合来说：add添加动作是一定成功的，返回值可用可不用。
 * 但是对于其它集合来说，add添加动作不一定成功。
 * public E get(int index): 从集合中获取元素，参数是索引编号，返回值是对应位置的元素
 * public E remove(int index):  从集合中删除元素，参数是索引编号，返回值被删除位置的元素
 * public int size(): 获取集合的尺寸长度，返回值是集合中包含的元素个数
 *
 */

public class Demo03ArrayListMethod {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []

        // 向集合中添加元素: add
        boolean success = list.add("Cat");
        System.out.println(list); // [Cat]
        System.out.println("添加的动作是否成功：" + success); // true

        list.add("Dog");
        list.add("Pig");
        System.out.println(list); // [Cat, Dog, Pig]

        // 从集合中索引元素：get。索引值从0开始
        String name = list.get(1);
        System.out.println("第1号索引值：" + name);

        // 从集合中删除元素,remove。索引值从0开始
        String whoRemove = list.remove(2);
        System.out.println("被删除的是" + whoRemove);
        System.out.println(list);

        System.out.println("集合的元素个数为：" + list.size());

    }

}
