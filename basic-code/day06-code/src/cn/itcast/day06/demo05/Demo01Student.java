package cn.itcast.day06.demo05;

/**
 * 2018-9-29
 */

public class Demo01Student {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Java");
        student.setAge(100);
        System.out.println("姓名：" + student.getName() + " 年龄：" + student.getAge());
        System.out.println("======================");

        Student student1 = new Student("Dog", 3);
        System.out.println("姓名：" + student1.getName() + " 年龄：" + student1.getAge());
        student1.setAge(4);
        System.out.println("姓名：" + student1.getName() + " 年龄：" + student1.getAge());



    }

}
