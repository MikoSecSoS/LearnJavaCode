package cn.itcast.day10.demo02;

/**
 * 2018-10-3
 *
 * 使用接口的时候需要注意
 *
 * 1. 接口是没有静态代码快或者构造方法的
 * 2. 一个类的直接弗雷是我iyide，但是一个类可以同时实现多个接口
 * 格式：
 * public class MtInterfaceImpl implements MyInterfaceA, MyInterfaceB {
 *     // 覆盖重写所有抽象方法
 * }
 * 3. 如果实现类所实现的多个接口当中，存在重复的抽象方法，那么只需要覆盖重写一次即可。
 * 4. 如果实现类没有覆盖重写所有的接口当中所有的抽象方法，那么实现类就必须是一个抽象类。
 * 5. 如果实现类所实现的多个接口当中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行覆盖重写。
 * 6. 一个类如果直接父类当中的方法，和接口当中的默认方法产生了冲突，优先使用父类当中的方法。Java中继承优先于接口
 *
 */

public class Demo01Interface {

    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
    }

}
