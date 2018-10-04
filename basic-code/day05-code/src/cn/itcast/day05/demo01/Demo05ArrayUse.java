package cn.itcast.day05.demo01;

/**
 * 2018-9-29
 * 动态初始化数组时：
 * 如果是整数类型，元素默认值为0;
 * 如果是浮点类型，元素默认值为0.0;
 * 如果是字符类型，元素默认值为'\u0000';
 * 如果是布尔类型，元素默认值为false;
 * 如果是引用类型，元素默认值为null;
 *
 * 注意事项：
 * 静态初始化也有默认值，不过系统自动把默认值替换成了大括号中相对应的数值。
 */

public class Demo05ArrayUse {

    public static void main(String[] args) {
        // 动态初始一个数组
        int[] arrayA = new int[3];

        System.out.println(arrayA); // 内存地址值 hash value
        System.out.println(arrayA[0]); // 0
        System.out.println(arrayA[1]); // 0
        System.out.println(arrayA[2]); // 0

        arrayA[0] = 120;
        arrayA[1] = 230;
        arrayA[2] = 30;
        System.out.println(arrayA[0]); // 120
        System.out.println(arrayA[1]); // 230
        System.out.println(arrayA[2]); // 30
    }

}
