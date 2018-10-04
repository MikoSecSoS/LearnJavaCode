package cn.itcast.day05.demo03;

/**
 * 2018-9-29
 * 获取数组长度格式：数组名称.length;
 *
 * 返回一个int数字代表数组的长度
 *
 * 数组一旦创建，程序运行期间，长度不可改变。
 */

public class Demo03ArrayLength {

    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {10, 50, 65, 0x9e, 650, 109, 50, 9, 0, 7, 7060};

        System.out.println("数组arraryB的长度为：" + arrayB.length);

        System.out.println("====================");

        int[] arrayC = new int[3];
        System.out.println(arrayC.length); // 3

        arrayC = new int[5];
        System.out.println(arrayC.length); // 5

        // 两个new，两个数组^_^
        /**
         * 栈（Stack）
         * (1). int[] arrayC  内存中arrayC == 0x9e
         * (3). println(arrayC); 寻找内存中的arrayC == 0x9e的长度
         * (4). arrayC
         *
         * 堆（Heap）
         * (2). new int[3]; { [0]0, [1]0, [2]0 }  16进制地址值 == 0x9e
         * (5). new int[5]; { [0]0, [1]0, [2]0 }  16进制地址在 == 0x233
         *
         */

    }

}
