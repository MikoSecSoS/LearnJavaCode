package cn.itcast.day06.demo04;

/**
 * 2018-9-29
 */

public class Demo01Person {

    public static void main(String[] args) {
        Person person = new Person();

        // Set My Name
        person.name = "Miko";
        person.sayHello("World");

        System.out.println(person); // 地址值
    }

}
