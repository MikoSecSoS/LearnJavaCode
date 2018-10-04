package cn.itcast.day04.demo03;

/**
 * 2018-9-29
 */

public class Demo03MethodPrint {

    public static void main(String[] args) {
        printCount(100);
    }

    public static void printCount(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("Hello World!! i=" + (i + 1));
        }
    }

}
