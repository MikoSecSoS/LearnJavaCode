package cn.itcast.day06.demo02;

/**
 * 2018-9-30
 */

import java.util.Scanner;

public class Demo02Anonymous {

    public static void main(String[] args) {
        // 普通方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        // 匿名对象方式
//        System.out.print("Please input number：");
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("You input is：" + num);

        // 使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

        // 使用匿名对象进行传参
        System.out.print("Please input number:");
        methodParam(new Scanner(System.in));

        // 使用匿名对
        Scanner sc = methodScanner();
        int num = sc.nextInt();
        System.out.println("Input is:" + num);
    }

    public static void methodParam(Scanner sc) {
        System.out.println("You input number is:" + sc.nextInt());
    }

    public static Scanner methodScanner() {
        System.out.print("Please input number:");
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);

    }

}
