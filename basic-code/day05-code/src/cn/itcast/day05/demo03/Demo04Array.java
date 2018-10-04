package cn.itcast.day05.demo03;

/**
 * 遍历数组：对数组当中的每一个元素进行逐一处理，默认的处理方式是打印输出。
 *
 */

public class Demo04Array {

    public static void main(String[] args) {
        int[] array = { 15, 25, 35, 45, 55,};

        // 首先使用最low println的方式。滑稽.jpg
        System.out.println(array[0]); // 15
        System.out.println(array[1]); // 25
        System.out.println(array[2]); // 35
        System.out.println(array[3]); // 45
        System.out.println(array[4]); // 55
        System.out.println("=====================");

        // 来个for循环qwq...
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
