package cn.itcast.day10.demo01;

/**
 * 2018-10-3
 *
 * 接口就是多个类的公共规范
 * 接口是一种引用数据类型，最重要的内容就是其中：抽象方法
 *
 * 定义接口的格式：
 * public interface 接口名称 { // 首字母大写，大陀峰，和类一样
 *      // 接口内容
 * }
 *
 * 备注：变成了interface之后，编译生成的字节码文件仍然是：.java --> .class
 *
 * 如果是Java 7，那么接空中的包含的内容有：
 * 1. 常量
 * 2. 抽象方法
 * 如果是Java 8，还可以额外包含有：
 * 4. 默认的方法
 * 5. 静态方法`
 * 如果是Java 9，还可以额外包含有：
 * 6. 私有方法
 *
 * 接口使用步骤：
 * 1. 接口不能直接使用，必须有一个“实现类”来实“现该”接口
 * 格式：
 * public class 实现类名称 implements 接口名称 {
 *     // ..
 * }
 * 2. 接口的实现必须覆盖重写（实现）接口中的抽象方法
 * 实现：去掉abstract关键字，加上方法体大括号。
 * 3. 创建实现类的对象，进行使用
 *
 * 注意事项：
 * 1. 如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类就必须是抽象类
 *
 */

public class Demo01Interface {

    public static void main(String[] args) {
        // 错误写法
//        MyInterfaceAbstract inter = new MyInterfaceAbstract();

        // 创建实现类对象的使用
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs();
        impl.methodAbs1();

    }

}
