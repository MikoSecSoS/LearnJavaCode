package cn.itcast.day06.demo02;

/**
 * 2018-9-30
 *
 * 创建对象标准格式：
 * 类名称 对象名 = new 类名称();
 *
 * 匿名对象就是只有右面的对象，，没有左面的名字和赋值运算符
 * new 类名称();
 *
 * 注意事项：匿名对象只能使用一次，下次使用只能重新new
 * 使用建议：如对象只需要运行一次，则可以使用匿名对象
 *
 */

public class Demo01Anonymous {

    public static void main(String[] args) {
        // 左面的person就是对象名字
        Person person = new Person();
        person.name = "Java";
        person.showName(); // My name is: Java
        System.out.println("=====================");

        //匿名对象
        new Person().name = "Anonymous";
        new Person().showName(); // My name is:null


    }

}
