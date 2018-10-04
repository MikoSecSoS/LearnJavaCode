package cn.itcast.day06.demo05;

/**
 * 2018-9-29
 *
 * 一个标准的类通常要满足一下四个部分
 *
 * 1. 所有的成员变量都要使用private关键字来修饰
 *
 * 2. 为没一个成员变量编写一对Getter/Setter方法
 *
 * 3. 编写一个无参数的构造方法
 *
 * 4. 编写一个全参数的构造方法
 *
 * 这样标准的类也叫做Jacv Bean
 *
 */

public class Student {

    private String name; // 姓名
    private int age; // 年龄


    // Alt+Insert
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
