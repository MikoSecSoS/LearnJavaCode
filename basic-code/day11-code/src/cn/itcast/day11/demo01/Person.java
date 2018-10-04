package cn.itcast.day11.demo01;

/**
 * 2018-10-4
 *
 * 对于成员变量来说,如果有final关键字修饰,那么这个变量也照样是不可变.
 *
 * 1. 由于成员变量具有默认值,一旦默认值被放进去,不可改变.所以使用final关键字之后必须手动赋值,否则不可赋值.
 * 2. 对于final的成员变量,要么直接赋值,要么通过构造方法进行赋值.二者选其一
 * 3. 必须保证类当中所有重载的构造方法,都最终会对final的成员变量进行赋值.
 *
 */

public class Person {

    private final String name/* = "7kb,菜菜,嘟嘟,Miko"*/;

    public Person() {
        name = "BiuBiuBiu";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
