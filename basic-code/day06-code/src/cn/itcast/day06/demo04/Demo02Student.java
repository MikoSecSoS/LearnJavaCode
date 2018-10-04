package cn.itcast.day06.demo04;

/**
 * 2018-9-29
 */

public class Demo02Student {

    public static void main(String[] args) {
        Student student = new Student(); // 无参构造
        System.out.println("=====================");

        Student student1 = new Student("Cat", 1);// 全参构造
        System.out.println("姓名：" + student1.getName() + "\n" + "年龄：" + student1.getAge());
        // 如果需要改变对象当中的成员变量数据内容，仍然需要setXxx方法
        student1.setAge(2);
        System.out.println("姓名：" + student1.getName() + "\n" + "年龄：" + student1.getAge());


    }

}
