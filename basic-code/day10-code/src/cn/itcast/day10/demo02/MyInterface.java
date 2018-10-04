package cn.itcast.day10.demo02;

/**
 * 2018-10-3
 *
 */

public interface MyInterface {

    public default void method() {
        System.out.println("接口父类方法");
    }

}
