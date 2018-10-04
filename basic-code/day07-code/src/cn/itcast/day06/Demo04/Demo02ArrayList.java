package cn.itcast.day06.Demo04;

import java.util.ArrayList;

/**
 * 2018-9-30
 *
 * 数组的长度不可发生改变
 * ArrayList集合的长度可改变
 *
 * 对于ArrayList来说，有一个尖括号代表泛型
 * 泛型：装载集合中的元素，全都是统一的类型。
 * 注意：泛型只能是引用类型，不能是基本类型
 *
 * 注意事项：
 * 对于ArrayList集合来说，直接打印得到的不是地址值，而是内容。
 * 如果内容为空，得到的是空的中括号。[]
 *
 */

public class Demo02ArrayList {

    public static void main(String[] args) {
        // 创建一个ArrayList集合。集合的名称是list，里面装的全都是String字符串类型
        // 备注：从JDK 1.7开始，右侧的见括号内部可以不写内容，但是尖括号本身还是要写的。JDK 1.7以下见括号中要写内容
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []

        // 相机和当中添加数据，需要使用add方法。
        list.add("Cat");
        System.out.println(list);

        list.add("Cat");
        list.add("Cat");
        list.add("Cat");
        System.out.println(list);

//        list.add(100) // 此时只能添加String

    }
}
