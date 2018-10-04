package cn.itcast.day10.demo01;

/**
 * 2018-10-3
 *
 * 注意事项：不能通过接口实现类的对象来调用接口当中的静态方法。
 * 正确写法：通过接口名称，直接调用其中的静态方法。
 * 格式：
 * 接口名称.静态方法名(参数名);
 *
 */

public class Demo03Interface {

    public static void main(String[] args) {
        // 创建了实现类对象
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl(); // 没有意义

        // 错误写法
//        impl.methodStatic();

        // 直接通过接口名称调用静态方法
        MyInterfaceStatic.methodStatic(); // 静态跟对象没关系，跟类有关系

    }

}
