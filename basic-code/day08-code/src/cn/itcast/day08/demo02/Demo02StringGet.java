package cn.itcast.day08.demo02;

/**
 * 2018-10-1
 *
 * public int length(); 获取字符串当子含有的字符个数：获取字符串长度
 * public String concat(String stb); 将当前字符串和参数字符串拼接成为返回值新的字符串：字符串拼接
 * public char charAt(int index); 获取指定索引位置的但个字符。索引从0开始
 * public int indexOf(String str); 查找字参数字符串在本字符串当中出现的索引位置，如果没有返回-1值
 *
 *
 */

public class Demo02StringGet {

    public static void main(String[] args) {
        // 获取字符串的长度
        int length = "dsahjfgaslfksdsjfhkjdf".length();
        System.out.println("字符串的长度为：" + length);

        // 拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1); // Hello 原封不动
        System.out.println(str2); // World 原封不动
        System.out.println(str3); // HelloWorld 新的字符串
        System.out.println("========================");

        // 获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("1号索引位置的之字符为：" + ch);
        System.out.println("========================");

        // 查找参数字符串在本来字符串当中出现的第一次索引位置
        // 如果没有，则返回-1
        String original = "HelloWorldHelloWorld";
        int index = original.indexOf("llo");
        System.out.println("第一次索引值是：" + index);

        System.out.println("HelloWorld".indexOf("abc")); // -1


    }

}
