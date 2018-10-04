package cn.itcast.day09.demo10;

/**
 * 2018-10-2
 *
 */

public abstract class Cat extends Animal { // 子类也是一个抽象类

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    // public abstract void sleep();

}
