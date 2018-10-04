package cn.itcast.day08.demo04;

import java.util.Arrays;

/**
 * 2018-10-1
 *
 * java.util.Arrays
 *
 * public static String toString(array) string [x, xx, xxx]
 * public static void sort(array) {2, 4, 1, 9, 8} --> [1, 2, 4, 8, 9]
 *
 * Remarks:
 * 1. if is number value, sort small --> big
 * 2. if is String, sott Letter abcdef...
 * 3. if is Custom class, Custom class have Comparable or Comparator jie kou de zhi chi.
 */

public class Demo01Arrays {

    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
        // int[] --> String
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr); // [10, 20, 30]

        int[] array1 = {2, 1, 3, 10, 6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2 = {"bbb", "aaa", "ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

    }

}
