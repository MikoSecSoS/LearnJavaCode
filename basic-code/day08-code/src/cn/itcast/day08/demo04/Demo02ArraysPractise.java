package cn.itcast.day08.demo04;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 2018-10-1
 *
 *
 * Use Arrays API, Random String Sort and Reverse
 */

public class Demo02ArraysPractise {

    public static void main(String[] args) {
        String str = "jkdsafkbn7avy6oiats0dklj3ia";

        // Array[] can use sort
        // String --> Array : use toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars); // sort
        System.out.println(Arrays.toString(chars));

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i] + " ");
        }
    }

}
