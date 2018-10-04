package cn.itcast.day08.demo04;

/**
 * 2018-10-1
 *
 * java.util.Math
 *
 * public static double ads(double num); get absolute value. Huo qu jue dui zhi
 *
 * public static double ceil(double num); xiang shang qu zheng, 12.1 = 13
 *
 * public static double floor(double num); xiang xia qu zheng, 61 = 60   69 = 60
 *
 * public static long round(double num); si she wu ru
 *
 * Math.PI = jin si yuan zhou lv.(double) 3.14159265358979323846
 *
 */

public class Demo03Math {

    public static void main(String[] args) {

        System.out.println(Math.abs(3.14)); // 3.14
        System.out.println(Math.abs(0)); // 0
        System.out.println(Math.abs(-2.5)); // 2.5
        System.out.println("================");


        System.out.println(Math.ceil(3.9)); // 4.0
        System.out.println(Math.ceil(3.1)); // 4.0
        System.out.println(Math.ceil(3.0)); // 3.0
        System.out.println("================");

        System.out.println(Math.floor(30.1)); // 30.0
        System.out.println(Math.floor(30.9)); // 30.0
        System.out.println(Math.floor(31.0)); // 31.0
        System.out.println("================");

        System.out.println(Math.round(20.4)); // 20.0
        System.out.println(Math.round(10.5)); // 11.0
        System.out.println("================");

        System.out.println(Math.random());
        System.out.println(Math.PI);




    }

}
