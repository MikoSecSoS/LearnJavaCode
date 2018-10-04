package cn.itcast.day11.demo01;

/**
 * 2018-10-4
 *
 * final关键字代表最终,不可改变的.
 *
 * 常见四种方法:
 * 1. 可以用来修饰一个类
 * 2. 可以用来修饰一个方法
 * 3. 可以用来修饰一个全局变量
 * 4. 可以用来修饰一个成员变量
 *
 */

public class Demo01Final {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(num); // 10
        num = 20;
        System.out.println(num); // 20

        // 一旦使用final用来修饰局部变量,那么这个变量就不能进行个更改
        // "一次使用,终生不变"
        final int num1 = 200;
        System.out.println(num1); // 200

//        num1 = 233; // 错误写法!不能改变!
//        num1 = 200; // 错误写法!

        // 正确写法!只要保证有唯一一次赋值即可.
        final int num2;
        num2 = 30;

        // 对于基本类型来说,不可变说的是变量当中的数据不可改变
        // 对于引用类型来说,不可变说的是变量当中的地址值不可改变
        Student student = new Student("Miko");
        System.out.println(student);
        System.out.println(student.getName()); // Miko
        student = new Student("Kiko");
        System.out.println(student);
        System.out.println(student.getName()); // Kiko

        System.out.println("=================");

        final Student student1 = new Student("Cico");
//        student1 = new Student("Kico") // 错误写法! final的引用类型变量,其中的地址不可改变
        System.out.println(student1);
        System.out.println(student1.getName()); // Cico
        student1.setName("Kicococo");
        System.out.println(student1);
        System.out.println(student1.getName()); // Kicococo

        System.out.println("=================");

        Person person = new Person();
        System.out.println(person.getName());

    }

}
