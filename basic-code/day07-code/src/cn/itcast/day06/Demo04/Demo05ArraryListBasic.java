package cn.itcast.day06.Demo04;

import java.util.ArrayList;

/**
 * 2018-9-30
 *
 * 如果希望向集合ArrayList中储存基本数据类型，必须使用基本类型的”包装类“
 *
 * 基本类型    包装类（引用类型，包装类都位于java.lang包下）
 * byte       Byte
 * short      Short
 * int        Integer   {特殊}
 * long       Long
 * float      Float
 * double     Double
 * char       Character {特殊}
 * boolean    Boolean
 * 大写开头字符int  char特殊
 *
 * 从JDK 1.5开始，支持自动装箱 自动拆箱
 *
 * 自动装箱：基本类型 ——> 包装类型
 * 自动拆箱：包装类型 ——> 基本类型
 *
 */

public class Demo05ArraryListBasic {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        // 错误写法！泛型只能是引用类型，不能是基本类型
//        ArrayList<int> listB = new ArrayList();

        ArrayList<Integer> listC = new ArrayList();
        listC.add(100);
        listC.add(200);
        listC.add(300);
        System.out.println(listC);

        int num = listC.get(1);
        System.out.println("第一号元素是：" + num);

    }

}
