package cn.itcast.day06.demo03;

/**
 * 通常情况下，一个类不能直接使用，需要根据类创建爱你一个对象才能使用。
 *
 * 1. 导包：指出需要使用的类在什么位置
 * import 包名称.类名称;
 * import cn.itcast.day06.demo03.Student;
 * 对于和当前类属于同一个包的情况下可省略导包语句
 *
 * 2. 创建
 * 类名称 对象名 = new 类名称();
 * Student student = new Student;
 *
 * 3. 使用
 * 使用成员变量：对象名.成员变量名
 * 使用成员方法：对象名.成员方法名(参数)
 * (用成员变量 or 方法加个.就好啦～～)
 *
 */

public class Demo02Student {

    public static void main(String[] args) {
        // 1.导包。
        // 需要使用Student类，和自己Demo02Student位于同一包下，省略导包

        // 2.创建：
        // 类名称 对象名 = new 类名称();
        // 根据Student类，创建了一个名为student的对象
        Student student = new Student();

        // 3. 使用成员变量
        // 对象名.成员变量名
        System.out.println(student.name); // 未赋值 所以为 String-默认值 null
        System.out.println(student.age); //  未赋值 所以为 int-默认值 0
        System.out.println("==============");

        // 改变对象中成员变量数值内容。将右侧字符串赋值给student对象当中的name成员变量
        student.name = "Miko";
        student.age = 15;
        System.out.println("姓名：" + student.name); // Miko
        System.out.println("年龄：" + student.age); // 15

        // 4. 使用成员方法
        // 对象名.成员方法(参数);
        student.study();
        student.eat();
        student.sleep();


    }

}
