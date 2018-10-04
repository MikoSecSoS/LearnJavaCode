package cn.itcast.day08.demo03;

/**
 * 2018-10-1
 *
 *
 *
 */

public class Student {

    private int id; // Student number
    private String name; // name
    private int age; // age
    static String room;
    private static int idCounter = 0; // new Object +1

    public Student() {
        this.id = ++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
