package cn.itcast.day10.demo01;

/**
 * 2018-10-3
 *
 * 问题描述：
 * 需要抽取一个共有方法，用来解决两个默认方法之间重复代码问题。
 * 但是这个共有方法不应高让实现类使用，应该是私有化的
 *
 * 从Java 9开始，接口允许定义私有方法
 * 1. 普通私有方法：解决多个默认方法之间重复代码问题
 * 2. 静态私有方法：解决多个静态方法之间重复代码问题
 *
 * 格式：
 * private 返回值类型 方法名称(参数列表) {
 *     方法体
 * }
 *
 * private static 返回值类型 方法名称(参数列表) {
 *     方法体
 * }
 *
 */

public interface MyInterfacePrivateA {

    public default void methodDefault1() {
        System.out.println("默认方法1");
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
        methodCommon();
    }

    public default void methodDefault2() {
        System.out.println("默认方法2");
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
        methodCommon();
    }

    private void methodCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

}
