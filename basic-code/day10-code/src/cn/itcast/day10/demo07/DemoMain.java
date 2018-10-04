package cn.itcast.day10.demo07;

/**
 * 2018-10-3
 *
 */

public class DemoMain {

    public static void main(String[] args) {
        // 创建一个电脑
        Computer computer = new Computer();
        computer.powerOn(); // 打开电脑

        // 准备一个鼠标,供电脑使用
//        Mouse mouse = new Mouse();
        // 向上转型
        USB usbMouse = new Mouse();
        // 参数是USB类型,正好转进去的就是USB鼠标
        computer.usbDevice(usbMouse);

        // 创建一个USB键盘
        Keyboard keyboard = new Keyboard(); // 没有使用多态写法
        // 方法参数是USB类型,传递进去的是实现类对象
        computer.usbDevice(keyboard); // 正确写法! 发生了向上转型

        // 使用子类对象,匿名对象
//        computer.usbDevice(new Keyboard()); // 也是正确写法

        computer.powerOff(); // 关闭电脑

        System.out.println("===============");

        method(10.0); // 正确写法: double --> double
        method(20); // 正确写法: int --> double
        int a = 30;
        method(a); // 正确写法: int --> double

    }

    public static void method(double num) {
        System.out.println(num);
    }

}
