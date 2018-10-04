package cn.itcast.day10.demo01;

/**
 * 2018-10-3
 *
 * 在任何版本的Java中，接口都能定义抽象方法
 *
 * 抽象方法格式：
 * public abstract 返回值类型 方法名称(参数列表);
 *
 * 注意事项：
 * 1. 接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract
 * 2. 这两个关键字修饰符，可以选择行地省略。
 * 3. 方法的三要素，可以随意定义。返回值类型，方法名称，参数列表
 *
 */

public interface MyInterfaceAbstract {

    // 不是抽象方法,修饰符必须是两个固定的关键字public, abstract
//    private abstract methodabs();

    // 抽象方法
    public abstract void methodAbs();

    // 抽象方法
    abstract void methodAbs1();

    // 抽象方法
    public void methodAbs2();

    // 抽象方法
    void methodAbs3();


}
