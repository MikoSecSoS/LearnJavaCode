package cn.itcast.day11.demo02.sub;

import cn.itcast.day11.demo02.MyClass;

/**
 * 2018-10-4
 *
 */

public class MySon extends MyClass {

    public void methodSon() {
//        System.out.println(super.num); // private    不能访问 (10)
//        System.out.println(super.num1); // (default) 不能访问 (11)
        System.out.println(super.num2); // protected   可以访问  12
        System.out.println(super.num3); // public      可以访问  13
    }

}
