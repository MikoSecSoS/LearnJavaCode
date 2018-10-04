package cn.itcast.day06.Demo03;

/**
 * 2018-9-29
 *
 * 局部变量和成员变量
 *
 * 1. 定义的位置不一样{重点}
 * 局部变量：在方法的内部
 * 成员变量：在方法的外部，直接写在类当中
 *
 * 2. 作用范围不一样{重点}
 * 局部变量：只有方法当中才可以使用，除了方法不能用
 * 成员变量：整个类全都通用
 *
 * 3. 默认值不一样{重点}
 * 局部变量：没有默认值，如果想使用必须手动进行赋值
 * 成员变量：如果没赋值，有默认值，规则和数组一样
 *
 * 4. 内存不一样 (了解)
 * 局部变量：位于栈内存
 * 成员变量：位于堆内存
 *
 * 5. 生命周期不一样
 * 局部变量：方法进栈诞生，出栈消失。
 * 局部变量：对象创建诞生，被垃圾回收消失
 * 通常：局部变量生命周期短，成员变量生命周期强
 */

public class Demo01VariableDifference {

    String name; // 成员变量

    public void methodA() {
        int num = 20; // 局部变量
        System.out.println(num);
        System.out.println(name);
    }

    public void methodB(int param) { // 方法的参数是局部变量
        // 参数在方法调用的时候，必然会被赋值,
        System.out.println(param);

        int age; // 局部变量
//        System.out.println(age); // 没赋值的局部变量不能用

//        System.out.println(num); // num在methodB没有定义

        System.out.println(name);
    }

}
