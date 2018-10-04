package cn.itcast.day09.demo08;

/**
 * 2018-10-2
 *
 * super关键字用来访问父类内容。
 *
 * this关键字用来访问本类内容。用法有三种
 * 1. 在本类的成员方法中，访问本类的成员变量
 * 2. 在本类的成员方法中，访问本类的另一个成员方法
 * 3. 在本类的构造方法中，访问本类的另一个构造方法
 *
 * A. this(...)调用必须也是构造方法的第一个语句。和super一样
 * B. super和this不能同时使用
 *
 */

public class Zi extends Fu {

    int num = 20;

    public Zi() {
        // super(); // 此行不再自动添加
        this(123); // 本类的无参构造调用本类的有参(全参)构造
//        this(123, 456); // 错误写法
    }

    public Zi(int n) {
        this(1, 2);
    }

    public Zi(int n, int m) {
//        this();
    }

    public void showNum() {
        int num = 10;
        System.out.println(num); // 局部变量
        System.out.println(this.num); // 本类中的成员变量
        System.out.println(super.num); // 父类中的成员变量
    }

    public void methodA() {
        System.out.println("AAAAA");
    }

    public void methodB() {
        methodA();
        this.methodA();
        System.out.println("BBBBB");
    }

}
