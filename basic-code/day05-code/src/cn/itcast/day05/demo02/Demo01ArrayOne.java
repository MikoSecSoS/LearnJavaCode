package cn.itcast.day05.demo02;

/**
 * 2018-9-29
 *
 */

public class Demo01ArrayOne {

    public static void main(String[] args) {
        int[] array = new int[3]; // 动态初始化
        System.out.println(array); // 地址值
        System.out.println(array[0]); // 0  默认值
        System.out.println(array[1]); // 0
        System.out.println(array[2]); // 0
        System.out.println("================");

        //改变数组当中的元素内容
        array[1] = 10;
        array[2] = 20;
        System.out.println(array); // 地址值 不变
        System.out.println(array[0]); // 0  默认值
        System.out.println(array[1]); // 10
        System.out.println(array[2]); // 20

        /**
         * 栈（Stack）：存放的都是方法中的局部变量。 方法的运行一定要在栈当中运行。
         * (2). main(String[] agrs) // 进栈
         * (3).     int[] array(5). 在内存中名称 == 0xe9
         * (6). System.out.println(array); // 去内存中寻找array的地址值0xe9
         * (7). System.out.println(array[0]); // 找array的地址值0xe9,中的[0]里面的元素。
         * (8). array[1]; array[2]; // 同上
         * (9). array[1] = 10; // 找array的地址值0xe9,中的[1]里面的元素,元素为0。 = 10; 赋值为10
         * (10). array[2] = 20; // 同上
         * (11). System.out.println(array) // 找地址值
         * (12). System.out.println(array[0]) // 找array->0xe9->0xe9[0] 并没有进行过修改所以为0
         * (13). array[1] array[2] // 同上，不过值被修改过了所以打印修改后的值 10   20
         *
         *
         * 堆（Heap）:凡是new出来的东西，都在堆当中
         * (4). new int[3]; // { [0]0, [1]0, [2]0 } == 16进制地址值 0xe9    0xe9=233  qwq
         *
         * 方法区 （Method Area）：储存.class相关信息，包含方法的信息。
         * (1). public static void main(String[] args)
         *
         */
    }

}
