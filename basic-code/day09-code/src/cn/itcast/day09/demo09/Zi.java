package cn.itcast.day09.demo09;

/**
 *
 * 2018-10-2
 */

public class Zi extends Fu {

    public Zi() {
        // super();
        System.out.println("子类构造方法执行");
    }

    @Override
    public void eat() {
        System.out.println("吃饭饭qwq");
    }

}
