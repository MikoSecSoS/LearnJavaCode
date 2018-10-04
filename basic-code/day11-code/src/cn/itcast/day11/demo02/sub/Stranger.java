package cn.itcast.day11.demo02.sub;

import cn.itcast.day11.demo02.MyClass;

/**
 * 2018-10-4
 *
 */

public class Stranger {

    public void methodStranger() {
//        System.out.println(new MyClass().num); // private   不能访问 (10)
//        System.out.println(new MyClass().num1); // (default) 不能访问 (11)
//        System.out.println(new MyClass().num2); // protected 不能访问 (12)
        System.out.println(new MyClass().num3); // public    可以访问  13
    }

}
