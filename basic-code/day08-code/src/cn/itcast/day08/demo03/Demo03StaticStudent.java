package cn.itcast.day08.demo03;

/**
 * 2018-10-1
 *
 */

public class Demo03StaticStudent {

    public static void main(String[] args) {
        // static method, use class name.
        Student.room = "101 room";

        Student one = new Student("Cat", 3);
        System.out.println("one Name:" + one.getName());
        System.out.println("one Name:" + one.getAge());
        System.out.println("one Name:" + Student.room); // class name

        System.out.println("==========================");

        Student two = new Student("Dog", 4);
        System.out.println("two Name:" + two.getName());
        System.out.println("two Name:" + two.getAge());
        System.out.println("two Name:" + Student.room); // class name

    }

    /**
     * Shack
     * (2). Student one
     * (4). Student two
     * (6). Student.room --> static String room --> Static Area { --> 101 room}
     *
     * Heap
     * (3). new Student  // one --> 0x9e
     *          String name;
     *          int age;
     * (5). new Student  // two --> 0x233
     *          String name;
     *          int age;
     *
     * Method Area
     * (1). Student.class{ String name;...static String room }
     * Static Area{
     *     room == 101room
     * }
     *
     */

}
