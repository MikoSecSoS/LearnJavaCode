package cn.itcast.day05.demo02;
/**
 * 2018-9-29
 * Java的内存需要划分成[五]个部分：
 *
 * 1.栈（Stack）：存放的都是方法中的局部变量。 方法的运行一定要在栈当中运行。
 *     局部变量：发放的参数，或者是方法（）内部的变量
 *     作用域：一旦超出作用域，立刻从栈内存当中消失。。离开大括号就会消失
 * 2.堆（Heap）：凡是new出来的东西，都在堆当中
 *     堆内存里面的东西都有一个地址值：16进制
 *     堆内存里面的数据，都有默认值，规则：
 *         如果是整数类型：默认值为0
 *         如果是浮点类型：默认值为0.0
 *         如果是字符类型：默认值为'\u0000'
 *         如果是布尔类型：默认值为false
 *         如果是引用类型：默认值为null
 * 3.方法区（Method Area）：储存.class相关信息，包含方法的信息。（死信息，方法的运行一定要在栈当中运行）
 *
 * 4.本地方法栈（Native Method Stack）：与操作系统相关
 *
 * 5.寄存器（pc Register）与CPU相关
 *
 */
public class JavaMemory {

    public static void main(String[] args) {
        System.out.println("栈（Stack）  方法的运行一定要在栈当中运行。");
        System.out.println("堆（Heap）：凡是new出来的东西，都在堆当中");
        System.out.println("方法区（Method Area）：储存.class相关信息，包含方法的信息。");
    }

}
