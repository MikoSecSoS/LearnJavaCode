package cn.itcast.day09.demo10;

public class DemoMain {

    public static void main(String[] args) {
//        Animal animal = new Animal(); // Error

//        Cat cat = new Cat(); // Error

        SmallCat01 smallCat01 = new SmallCat01(); // 普通类可以直接new对象
        smallCat01.eat();
        smallCat01.sleep();

        System.out.println("=================");

        SmallCat smallCat = new SmallCat();
        smallCat.eat();
        smallCat.sleep();
    }

}
