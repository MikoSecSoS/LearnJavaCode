package cn.itcast.day06.demo04;

/**
 * 2018-9-29
 *
 * 当方法的局部变量和类的成员变量重名的时候，根据“就近原则”，优先使用局部变量
 * 如果需要访问本类中的成员变量 需要使用this
 * this.成员变量
 *
 * 谁调用的方法，谁就是this.
 */

public class Person {

    String name; // Me Name

    // 参数name是对方名字
    // 成员变量name是自己名字
    public void sayHello(String name) {
        System.out.println("Hello " + name + ", Me is " + this.name);
        System.out.println(this);
    }

}
