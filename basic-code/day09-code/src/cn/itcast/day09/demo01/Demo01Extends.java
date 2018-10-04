package cn.itcast.day09.demo01;

import java.lang.reflect.Array;

/**
 * 2018-10-2
 *
 * 在继承的关系中，“子类就是一个父类“，也就是说，子类可以被当作父类看待。
 * 例如父类是员工，子类是讲师，那么"讲师就是一个员工"。关系：is-a
 *
 * 定义父类的格式：（一个普通的类定义）
 * public class 父类名称 {
 *     // ...
 * }
 *
 * 定义子类的格式：
 * public class 子类名称 extends 父类名称 {
 *     // ...
 * }
 *
 *
 */

public class Demo01Extends {

    public static void main(String[] args) {
        //创建了一个子类对象
        Teacher teacher = new Teacher();

        // Teacher类当中虽然什么内容都没写，但是会继承来自父类的method方法
        teacher.method();

        // 创建了一个子类助教的对象
        Arristant arristant = new Arristant();
        arristant.method();

    }

}
