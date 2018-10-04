package cn.itcast.day11.demo02;

/**
 * 2018-10-4
 *
 */

public class MyAnother {

    public void anotherMethod() {
//        System.out.println(new MyClass().num);  // private  不能访问 (10)
        System.out.println(new MyClass().num1); // (default)  可以访问 11
        System.out.println(new MyClass().num2); //  protected 可以访问 12
        System.out.println(new MyClass().num3); //  public    可以访问 13
    }

}
