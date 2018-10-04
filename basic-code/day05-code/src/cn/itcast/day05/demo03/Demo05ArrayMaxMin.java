package cn.itcast.day05.demo03;

/**
 * 2018-9-29
 * Hello dear World.(@^_^@)
 */


public class Demo05ArrayMaxMin {

    public static void main(String[] args) {

        int[] array = { 12, 45, 64, 654, 64, 8, 56, 4, 65, 456 };

        System.out.println("最大值：" + Max(array));
        System.out.println("最小值：" + Min(array));

    }

    public static int Max(int[] array) {

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (i > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int Min(int[] array) {

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (i < min) {
                min = array[i];
            }
        }
        return min;
    }

}
