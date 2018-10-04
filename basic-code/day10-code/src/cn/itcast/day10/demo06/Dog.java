package cn.itcast.day10.demo06;

/**
 * 2018-10-3
 *
 */

public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("狗吃SHIT");
    }

    public void watchHouse() {
        System.out.println("狗看家");
    }

}
