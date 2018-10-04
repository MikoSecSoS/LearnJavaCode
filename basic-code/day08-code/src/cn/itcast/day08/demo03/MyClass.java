package cn.itcast.day08.demo03;

/**
 * 2018-10-1S
 *
 * !!! !!! !!!
 * 1. static not use (not static)
 * because: Memory first static content, after some not static content
 * 2. static method not have (this)
 * because: this == I'am the object of the object that use me. use static method not use object name.
 *
 *
 */

public class MyClass {

    int num;
    static int numStatic;

    public void method() {
        System.out.println("This is member method");
        // member method can use member variable
        System.out.println(num);
        // member method can use static variable
        System.out.println(numStatic);
    }

    public static void methodStatic() {
        System.out.println("This is static method");
        // static method can use variable
        System.out.println(numStatic);
        // static method not can use variable
//        System.out.println(num);

//        System.out.println(this);
    }


}
