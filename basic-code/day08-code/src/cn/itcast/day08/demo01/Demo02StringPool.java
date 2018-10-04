package cn.itcast.day08.demo01;

/**
 * 2018-10-1
 *
 * 字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池中。
 *
 * 对于基本类型来说，==是进行数值的比较。
 * 对于引用类型来说，==是进行{地址值}的比较。
 *
 */


public class Demo02StringPool {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);

        System.out.println(str1 == str2); // True
        System.out.println(str1 == str3); // false
        System.out.println(str2 == str3); // false

    }

    /**
     * 1. 对于引用类型来说， ==进行的是地址值得比较。
     * 2, 双引号直接写的字符串在常量池中。new的不在池当中。
     *
     * 栈(Shack)
     * (1). String str1
     * (3). String str2
     * (5). char[] charArray
     * (7). String str3
     *
     * 堆(Heap)
     * JDK1.7开始字符串常量池在堆当中
     *     字符串常量池
     *     (2). String | String str1  --> String == 0x9e --> byte[97(a) 98(b) 99(c)]
     *     (4). String | 池中有abc 重复利用。 str2 --> 0x9e
     *     (6). charArray |   -->   char['a', 'b', 'c']
     * (8). new String(charArray)  | new的String不在池里。
     *          char['a', 'b', 'c'] --> byte[97(a) 98(b) 99(c)]
     *          String == 0x9d --> bytebyte[97(a) 98(b) 99(c)]
     *
     */

}
