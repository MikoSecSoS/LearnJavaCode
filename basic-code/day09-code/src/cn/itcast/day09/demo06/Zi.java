package cn.itcast.day09.demo06;

/**
 * 2018-10-2
 *
 */

public class Zi extends Fu {

    public Zi() {
        // super(); // 调用父类无参构造方法，必须调用父类构造方法，如不写编译器自动添加,全参构造方法不会自动添加
        super(20); // 在调用父类重载的构造方法，只能调用一次，必须是第一行第一个语句第一个分号
        System.out.println("子类无参构造方法");
    }

    public void method() {
        // super; //错误写法，只有子类的构造方法，才能调用父类的构造方法
    }

}
