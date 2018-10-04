package cn.itcast.day11.demo01;

/**
 * 2018-10-4
 *
 */

public class Zi extends Fu {

    @Override
    public void methodAbs() {

    }

    // 错误写法!不能覆盖重写父类当中被final修饰的方法
//    @Override
//    public void method() {
//        System.out.println("子类覆盖重写父类方法执行");
//    }

}
