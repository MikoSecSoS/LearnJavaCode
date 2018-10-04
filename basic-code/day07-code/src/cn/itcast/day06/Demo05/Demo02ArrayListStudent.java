package cn.itcast.day06.Demo05;

import java.util.ArrayList;

/**
 * 2018-9-30
 *
 * 题目：
 * 自定义4个学生对象，添加到集合，并遍历
 *
 * 思路：
 * 1. 自定义个一个学生类，四个部分
 * 2. 创建一个集合，用来存储学生对象。泛型：<Student>
 * 3. 根据类，创建4个学生对象。
 * 4. 将4个学生对象添加到集合中：add
 * 5. 便利集合：for size get
 */

public class Demo02ArrayListStudent {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("Cat",2);
        Student two = new Student("Cat",1);
        Student three = new Student("Dog",2);
        Student four = new Student("Dog",1);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);


        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println("Name：" + student.getName() + " Age：" + student.getAge());
        }

    }

}
