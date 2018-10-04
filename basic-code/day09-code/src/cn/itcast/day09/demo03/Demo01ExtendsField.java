package cn.itcast.day09.demo03;

/**
 * 2018-10-2
 *
 * 创建的对象是谁，就优先使用谁，如果没有往上找
 *
 * 无论是成员方法还是成员变量，如果没有会往上找(父类)，而不会往下找(子类)
 *
 * 重写(Override)
 * 概念：继承关系中，方法的名称一样，参数列表也一样
 *
 * 重写(Override)：方法名称一样，参数列表[也一样]。  覆盖，重写
 * 重载(Override)：方法名称一样，参数列表[不一样]。
 *
 *
 */

public class Demo01ExtendsField {

    public static void main(String[] args) {
        Zi zi = new Zi();

        zi.methodFu();
        zi.methodZi();

        zi.mothod();

    }

}
