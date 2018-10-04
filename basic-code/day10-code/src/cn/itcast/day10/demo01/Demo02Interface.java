package cn.itcast.day10.demo01;

/**
 * 2018-10-3
 *
 * 1. 接口的默认方法，可以直接通过接口实现类对象，进行调用
 * 2. 接口的默认方法，也可以被接口实现类进行覆盖重写
 *
 */

public class Demo02Interface {

    public static void main(String[] args) {
        // 创建了实现类对象
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs(); // 调用抽象方法，实际运行是的是右侧的实现类

        // 调用默认方法，如果实现类中没有，会向上找接口
        a.methodDefault(); // 这是一个新添加的默认方法
        System.out.println("===============");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault(); // 实现类B覆盖重写了接口的默认方法

    }

}
