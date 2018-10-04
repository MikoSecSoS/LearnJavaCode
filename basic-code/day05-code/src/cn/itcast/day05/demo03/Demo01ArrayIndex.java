package cn.itcast.day05.demo03;

/**
 * 2018-9-29
 * 数组的索引编号从0开始，一直到“数组的长度—1”为止。
 *
 * 如果访问数组元素的时候，索引编号并不存在，那么将会发生
 * 数组索引越界异常
 * ArrayIndexOutOfBoundsExpetion
 *
 * 原因：索引编号超出索引编号最大值
 * 解决：索引的编号改小点呗～毕竟Java连空气这一说都木有，所以连空气都索引不到QAQ
 */

public class Demo01ArrayIndex {

    public static void main(String[] args) {
        int[] array = { 15, 25, 35 };

        System.out.println(array[0]); // 15
        System.out.println(array[1]); // 25
        System.out.println(array[2]); // 35

        // 尝试作死qwq，访问array不存在的3号元素～
        System.out.println(array[3]);
        // ArrayIndexOutOfBoundsException数组索引越界异常
        // 错误在cn.itcast.day05.demo03.Demo01ArrayIndex.main(Demo01ArrayIndex.java:17)
        // Demo01ArrayIndex.java的第17行
        //

    }

}
