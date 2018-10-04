package cn.itcast.day10.demo01;

/**
 * 2018-10-3
 *
 */

public interface MyInterfacePrivateB {

    public static void methodStatic1() {
        System.out.println("静态方法1");
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
        methodStaticCommon();
    }

    public static void methodStaitc2() {
        System.out.println("静态方法2");
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
        methodStaticCommon();
    }

    private static void methodStaticCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

}
