package cn.itcast.day08.demo03;

/**
 * 2018-10-1
 *
 */

public class Demo01StaticField {

    public static void main(String[] args) {

        Student two = new Student("Kiko", 28);
        two.room = "101 room";
        System.out.println("Name:" + two.getName()
                + " Age:" + two.getAge() + " room:" + two.room
                + " Student number:" + two.getId());

        Student one = new Student("Miko", 15);
        System.out.println("Name:" + one.getName()
                + " Age:" + one.getAge() + " room:" + one.room
                + " Student number:" + one.getId());

    }

}
