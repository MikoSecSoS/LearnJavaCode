package cn.itcast.day11.demo05;

/**
 * 2018-10-4
 *
 * 如果是接口的实现类（或者是父类的子类）只需要使用唯一的一次
 * 那么这种情况下下就看省略掉该类的定义，而改为使用{匿名内部类}
 *
 * 匿名内部类的定义格式：
 * 接口名称 对象名 = new 接口名称() {
 *     // 覆盖重写所有抽象方法
 * };
 *
 * 对格式“new 接口名称() {...}”进行解析
 * 1. new代表创建对象的动作
 * 2. 接口名技术内部类需要实现哪个接口
 * 3. {...}这才是匿名内部类的内容
 *
 * 注意问题：
 * 1. 匿名内部类，在{创建对象}的时候，只能使用唯一一次。
 * 如果希望多次创建对象，而且类的内容意义昂的话，那么就必须使用单独定义的实现类;
 * 2. 匿名对象，在{调用方法}的时候，只能调用唯一一次
 * 如果希望同一个对象，调用多次方法，那么必须给对象起个名字。
 * 3. 匿名内部类是省略了{实现类/子类名称}，匿名对象类是省略了{对象名称}
 * 强调：匿名内部类和匿名对象不是一回事！！！
 *
 */

public class DemoMain {

    public static void main(String[] args) {
//        MyInterface obj = new MyInterfaceImpl();
//        obj.mothod();

//        MyInterface some = new MyInterface(); // 错误写法！

        // 使用匿名内部类,但不是匿名对象，对象名称就叫objA
        MyInterface objA = new MyInterface() {

            @Override
            public void mothod() {
                System.out.println("匿名内部类实现了方法qwp!??0000-A");
            }

            @Override
            public void mothod1() {
                System.out.println("匿名内部类实现了方法qwp!??1111-A");
            }

        };
        objA.mothod();
        objA.mothod1();

        System.out.println("===================");

        // 使用匿名内部类,而且省略了对象名称，也是匿名对象。
        new MyInterface() {

            @Override
            public void mothod() {
                System.out.println("匿名内部类实现了方法qwp!??0000-B");
            }

            @Override
            public void mothod1() {
                System.out.println("匿名内部类实现了方法qwp!??1111-B");
            }

        }.mothod();
        // 因为匿名对象类无法调用二次方法，所以需要在创建一个匿名对象类
        new MyInterface() {

            @Override
            public void mothod() {
                System.out.println("匿名内部类实现了方法qwp!??0000-B");
            }

            @Override
            public void mothod1() {
                System.out.println("匿名内部类实现了方法qwp!??1111-B");
            }

        }.mothod1();


    }

}
