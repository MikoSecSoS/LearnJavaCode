package cn.itcast.day05.demo03;

/**
 * 2018-8-29
 * 数组必须进行new初始化才能使用其中的元素
 *
 * 如果只是赋值了一个 null 没有进行new创建
 * 将会发生：
 * 空指针异常
 * NullPointerExption
 *
 *
 * 原因 : 没有 new
 * 解决 : 添加 new
 *
 */


public class Demo02ArrayNull {

    public static void main(String[] args) {
/*
        int[] array;
        // array = new int[3];  // 老师让注释的QAQ

        System.out.println(array[0]); // null 没给东西嘛～注释了，所以null啥东西都木有的意思，这算空气吧。。。
        // Errot(9,28) java: 可能尚未初始化变量arrary
*/
/*

        int[] array =null;
        System.out.println(array[0]);
        // NullPointerExption
*/


        int[] array;
        array = new int[3];
        System.out.println(array[0]);
    }

}
