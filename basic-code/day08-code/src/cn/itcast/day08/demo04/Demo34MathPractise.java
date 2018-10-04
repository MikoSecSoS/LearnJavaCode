package cn.itcast.day08.demo04;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 2018-10-1
 *
 * -10.8--5.5 abs > 6  or abs < 2.1  zheng shu you duo shao
 *
 *
 * 1. for
 * 2. -10.8 -> 10
 *      2.1  Math.ceil
 *      2.2  (int)
 * 3. num++
 * 4. Math.abs
 * 5. int
 *
 */


public class Demo34MathPractise {

    public static void main(String[] args) {
        ArrayList<Integer> count = new ArrayList<>();
        double min = -10.8;
        double max = 5.5;
        for (int i = (int)min; i < max; i++) {
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1) {
                System.out.print(i + " ");
                count.add(i);
            }
        }
        System.out.println();
        System.out.println(count);
        System.out.println("Have:" + count.size());


    }

}
