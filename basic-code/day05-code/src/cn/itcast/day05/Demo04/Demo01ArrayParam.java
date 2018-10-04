package cn.itcast.day05.Demo04;

/**
 * 2018-9-29
 * Java OOD, I'am comeing.
 */

public class Demo01ArrayParam {

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < array.length; i++) {
            System.out.print(array.length + " ");
        }

        System.out.println("==========AAA==========");
        printArray(array); // 传给方法地址值，方法也接受地址值

        System.out.println("==========BBB==========");
        printArray(array);


        System.out.println(array); // 地址值

//        System.out.println("AAA");
//
//        for (int i; i < array.length; i++) {
//            System.out.println(array.length);
//        }
//
//        System.out.println("BBB");
//
//        for (int i; i < array.length; i++) {
//            System.out.println(array.length);
//        }

    }

    /**
     * 三要素
     * 返回值类型：无返回值用void
     * 方法名称：见名其意，看见方法名称就知道是用来做什么的qwq
     * 参数列表：给方法形参（数组），方法才可以使用数组的元素
     */

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array.length + " ");
        }
    }

}
