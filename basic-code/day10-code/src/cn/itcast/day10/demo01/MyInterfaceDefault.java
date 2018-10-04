package cn.itcast.day10.demo01;

/**
 * 2018-10-3
 *
 * 从Java 8 开始，接口允许定义默认方法
 * 格式：
 * public default 返回值类型 方法名称(参数列表) {
 *     方法体
 * }
 *
 * 备注：接口当中的默认方法，可以同来解决升级的问题
 *
 */

public interface MyInterfaceDefault {

    // 抽象方法
    public abstract void methodAbs();

    // 新添加了一个抽象方法
//    public abstract void methodAbs1();

    // 新添加的方法，改成默认方法
    public default void  methodDefault() {
        System.out.println("这是一个新添加的默认方法");
    }

}
