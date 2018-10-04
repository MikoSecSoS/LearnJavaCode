package cn.itcast.day10.demo06;

/**
 * 2018-10-3
 *
 * 如何才能知道父类引用的对象,本来是什么子类
 * 格式:
 * 对象 instanceof 类名称
 * 这将会得到一个boolean值的结果,也就是判断前面的对象能不能当作后面类型的实例/
 *
 */

public class Demo02Instanceof {

    public static void main(String[] args) {
        Animal animal = new Dog(); // 本来是一只狗
        animal.eat(); // 狗吃SHIt

        // 如果希望调用子类的有的方法,需要向下转型
        // 判断一下父类引用animal本来是不是Dog
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

        System.out.println("===============");

        giveMeAPet(new Cat());

    }

    public static void giveMeAPet(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }

}
