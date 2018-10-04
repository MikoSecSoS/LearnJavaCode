package cn.itcast.day06.demo03;

import java.util.Arrays;

/**
 * 2018-9-29
 * Hello Java OOD.I'am Miko~
 *
 * 面向过程：当需要实现某个功能的时候，每一个具体步骤都要亲力亲为，详细处理没一个细节：更关注于过程
 * 面向对象：当需要实现某个功能的时候，不关心具体步骤，找个能完成某功能的人来实现：更关注于结果
 *
 */

public class Demo01PrintArray {

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };

        // 要求：打印 [10, 20, 30, 40, 50]

        // 面向过程
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            // 判断是否为最后一个元素
            if (i == array.length - 1) {
                System.out.print(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }

        System.out.println("\n====================");

        // 面向对象
        // 寻找JDK提供的Arrays类
        // 其中toString方法，可直接将数组换成需要格式化的字符串
        System.out.println(Arrays.toString(array));

    }

}
