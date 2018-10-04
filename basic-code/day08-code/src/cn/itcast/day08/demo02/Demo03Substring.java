package cn.itcast.day08.demo02;

/**
 * 2018-10-1
 *
 *
 * public String substring(int index);
 * public String substring(int begin, int end);
 * [begin, end)
 *
 *
 */

public class Demo03Substring {

    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1); // HelloWorld
        System.out.println(str2); // World
        System.out.println("=======================");

        String str3 = str1.substring(4, 7);
        System.out.println(str3); // oWo
        System.out.println("=======================");


        String strA = "Hello"; // strA = Hello -->0x9e
        System.out.println(strA); // Hello
        strA = "Java"; // strA == Java --> 0x9d
        System.out.println(strA); // Java

    }

}
