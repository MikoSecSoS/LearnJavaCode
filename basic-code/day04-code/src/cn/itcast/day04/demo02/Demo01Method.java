package cn.itcast.day04.demo02;


/**
 * 2018-9-29
 *
 */

public class Demo01Method {

    public static void main(String[] args) {
        printMethod();
    }

    public static void printMethod() {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
