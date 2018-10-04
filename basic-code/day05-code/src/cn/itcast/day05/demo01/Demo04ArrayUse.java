package cn.itcast.day05.demo01;

/**
 * 2018-9-29
 * 直接打印数组名称，得到的是数组对应的：内存地址哈希值(hash Value)。
 *
 * 二进制：01
 * 十进制：0123456789
 * 十六进制：0123456789abcdef
 *
 * 访问数组元素的格式：数组名称[索引值]
 * 索引值：是一个int数字，代表数字当中的元素编号。
 * 注意: 索引值从0开始，一直到“数组长度减-1”为止。
 */


public class Demo04ArrayUse {

    public static void main(String[] args) {
        // 静态初始化的省略格式
        int[] array = { 10, 20, 30};

        System.out.println(array); // [I@677327b6   [代表是数组 I代表是int类型 677327b6是16进制
        System.out.println(0x677327b6);

        System.out.println(array[0]); // 10
        System.out.println(array[1]); // 20
        System.out.println(array[2]); // 30

        for (int i = 0; i < 20; i++) {
            System.out.print("=");
        }
        System.out.println();

        int num = array[1]; // { 10, 20, 30}
        System.out.println(num); // 20
    }

}
