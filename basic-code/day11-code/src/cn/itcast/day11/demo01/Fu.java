package cn.itcast.day11.demo01;

/**
 * 2018-10-4
 *
 * 当final关键字来修饰一个方法时候,这个方法就是最终方法,也就是不能被覆盖重写.
 * 格式:
 * 修师傅 final 返回值类型 方法名称(参数列表) {
 *     方法体
 * }
 *
 * 注意事项:
 * 1. 对于类,方法来说,abstract关键字和final关键字不能同时使用,因为矛盾
 *     abstract关键字一定要被覆盖重写
 *     final关键字不能被覆盖重写
 *
 */

public abstract class Fu {

    public final void method() {
        System.out.println("父类方法执行");
    }

    public abstract /*final*/ void methodAbs();

}
