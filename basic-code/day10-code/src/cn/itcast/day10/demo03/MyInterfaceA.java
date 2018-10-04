package cn.itcast.day10.demo03;

/**
 * 2018-10-3
 *
 */

public interface MyInterfaceA {

    public abstract void methodA();

    public abstract void methodCommon();

    public default void methodDefault() {
        System.out.println("AAA");
    }

}
