package cn.itcast.day10.demo06;

/**
 * 2018-10-3
 *
 * 向上转型一定是安全的，没有问题的，正确的，但是也有一个弊端：
 * 对象一旦转型为父类，那么就无法调用子类原本特有的内容
 *
 * 解决方案：向下转型{还原}
 *
 */

public class Demo01Main {

    public static void main(String[] args) {
        // 对象的向上转型，就是：父类引用指向子类对象
        Animal animal = new Cat(); // 本来的时候是一直猫
        animal.eat(); // 猫吃鱼

//        animal.catchMouse(); // 错误写法

        // 向下转型，进行“还原动作”
        Cat cat = (Cat) animal;
        cat.catchMouse(); // 猫抓老鼠

        // 下面的是错误的向下转型
        // new的时候是Cat，现在还原为Dog
        // 错误写法！编译不会出错，但是运行会出现异常
        // java.lang.ClassCastException，类转换异常
        Dog dog = (Dog) animal;

    }

}
