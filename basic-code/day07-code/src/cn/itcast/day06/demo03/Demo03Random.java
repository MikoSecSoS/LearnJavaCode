package cn.itcast.day06.demo03;

import java.util.Random;
import java.util.Scanner;

/**
 * 2018-9-30
 *
 * 题目要求：
 * 根据int变量的n的值，来获取随机数字， 范围是[1, n],可以取到1也可以取到n
 *
 * 思路：
 * 1. 定义一个int变量n，Scanner输入
 * 2. 使用Random.nextInt()
 * 3. 如果写10则为0-9，需求是1-9，可以把10+1  0-10
 * 4. 打印随机数
 *
 */

public class Demo03Random {

    public static void main(String[] args) {
        System.out.print("请输入随机数打印范围的最大数字:");
        int n = new Scanner(System.in).nextInt();

        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            // 本来范围是[0,n),返回内容+1后变成了[1,n+1),也就是，[0,n)+1 [0+1, n+1)
            int result = r.nextInt(n) + 1; // 如果把1写在nextInt(n+1) [0, n+1)
            System.out.print(result + " ");

        }
    }

}
