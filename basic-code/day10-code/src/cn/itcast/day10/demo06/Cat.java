package cn.itcast.day10.demo06;

/**
 * 2018-10-3
 *
 */

public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }

}
