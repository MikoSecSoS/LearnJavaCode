package cn.itcast.day06.demo03;

import java.util.Random;
import java.util.Scanner;

/**
 * 2018-9-30
 *
 * Random类用来生成随机数字
 *
 * 1. 导包
 * import java.util.Random
 *
 * 2. 创建
 * int n = new Random(); // 小括号当中留空即可
 *
 * 3. 使用
 * 获取一个随机的int数字(范围是int所以范围，大约是-21亿——+21亿): int num = r.nextInt()
 * 获取一个随机的int数字(参数代表了范围，左闭右开区间)：int num = r.nextInt(3);
 * 实际代表的含义是：[0,3),也就是0-2
 *
 */

public class Demo01Random {

    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt();
        System.out.println("随机数为：" + num);

    }



}
