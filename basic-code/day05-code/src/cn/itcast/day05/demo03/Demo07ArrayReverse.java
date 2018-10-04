package cn.itcast.day05.demo03;

/**
 * 2018-9-29
 * 数组反转emmmm
 * Python: 人生苦短，Python是岸
 * 第一种：list(reversed(range(10)))
 * 第二种：sorted(range(10), reverse=True)
 * 第三种：list(range(10)[::-1])
 */

public class Demo07ArrayReverse {

    public static void main(String[] args) {

        int[] arrayA = new int[10];

        System.out.print("反转前数组内容为：");
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = (int) (Math.random() * 10);
            System.out.print(arrayA[i] + " ");
        }


        System.out.print("\n反转后数组内容为：");

        for (int min = 0, max = arrayA.length - 1; min < max; min++, max--) {
            int temp = arrayA[min];
            arrayA[min] = arrayA[max];
            arrayA[max] = temp;
        }

        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }

        System.out.println("\n==================================");

        int[] arrayAA = new int[10];

        System.out.print("反转前数组内容为：");
        for (int i = 0; i < arrayAA.length; i++) {
            arrayAA[i] = (int) (Math.random() * 10);
            System.out.print(arrayAA[i] + " ");
        }

        System.out.print("\n反转后数组内容为：");

        // 调用自己写的方法非常low的方法emmm
        int[] arrayB = Reverse(arrayAA);
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print(arrayB[i] + " ");
        }
    }
    // 自己的方法
    public static int[] Reverse(int[] array) {
        int[] arrayB = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayB[array.length-(1+i)] = array[i];
        }
        return arrayB;
    }

}
