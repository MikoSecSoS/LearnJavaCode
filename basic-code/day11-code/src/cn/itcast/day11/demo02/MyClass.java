package cn.itcast.day11.demo02;

/**
 * 2018-10-4
 *
 */

public class MyClass {

    private int num = 10;
    int num1 = 11;
    protected int num2 = 12;
    public int num3 = 13;

    public void method() {
        System.out.println(num);  // private   可以访问 10
        System.out.println(num1); // (default) 可以访问 11
        System.out.println(num2); // protected 可以访问 12
        System.out.println(num3); // public    可以访问 13
    }

}
