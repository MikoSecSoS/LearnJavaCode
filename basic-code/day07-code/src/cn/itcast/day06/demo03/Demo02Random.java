package cn.itcast.day06.demo03;

import java.util.Random;

/**
 * 2018-9-30
 */


public class Demo02Random {

    public static void main(String[] args) {

        Random r = new Random();

        for (int i = 0; i < 100; i++) {

            int num = r.nextInt(10); // 范围0-9 0 1 2 3 4 5 6 7 8 9

            System.out.print(num + " ");

        }

    }

}
