package cn.itcast.day06.Demo04;

/**
 * 2018-9-30
 *
 * 题目：
 * 定义一个数组，来储存3个Person对象
 *
 * 缺点：
 * 一旦创建，程序运行期间长度不可改变。
 *
 */

public class Demo01Array {

    public static void main(String[] args) {
        // 创建一个长度为三的数组，里面用来存放Person类型的对象
        Person[] array = new Person[3];
        System.out.println(array[0]); // null

        Person one = new Person("Cat",2);
        Person two= new Person("Dog",3);
        Person three = new Person("Pig",3);


        // 将one当中的地址值赋值到数组的0号元素
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]); // 地址值
        System.out.println(array[1]); // 地址值
        System.out.println(array[2]); // 地址值

        Person person = array[0];
        System.out.println(person.getName()); // Cat

        System.out.println(array[1].getName()); // Dog

    }

}
