package cn.itcast.day06.Demo03;

/**
 * 2018-9-29
 */

public class Demo03Person {

    public static void main(String[] args) {
        Parson parson = new Parson();
        parson.show();

        System.out.println("================");

        parson.name = "Cat";
//        parson.age = -2; // 无法直接访问private内容
        parson.setAge(-1); // 为什么要这样写：因为setAge是个方法有大括号{}可以写if语句
        parson.show();

        parson.name = "Dog";
        parson.setAge(5); // 为什么要这样写：因为setAge是个方法有大括号{}可以写if语句
        parson.show();

    }

}
