package cn.itcast.day09.demo06;

/**
 * 2018-10-2
 *
 * 继承关系中，父子类构造方法的特点。
 *
 * 1. 子类构造方法中，有一个默认的"super()"调用，所以一定是先调用的父类构造，后执行的子类构造
 * 2. 子类构造方法可以用super()关键字调用父类重载构造方法
 * 3. super的父类方法构造调用，必须是子类构造方法的第一个语句。不能一个子类构造调用多次super构造
 *
 * 总结：
 * 子类必须调用父类构造方法，不写则自动添加super();写了则用指定的super语句,super()只能有一个，并且是第一个分号
 *
 */

public class Demo01Constructor {

    public static void main(String[] args) {
        // 先打印父类构造内容，在打印父类构造方法的内容
        Zi zi = new Zi();

    }

}
