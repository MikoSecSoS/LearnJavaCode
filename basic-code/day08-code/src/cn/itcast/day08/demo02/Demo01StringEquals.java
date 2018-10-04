package cn.itcast.day08.demo02;

/**
 * 2018-10-1
 *
 * ==是进行对象的值比较，如果需要对字符串的内容进行比较，可以使用两个方法：
 *
 * public boolean equals(Object obj); 参数可以是任何对象，只有参数是一个字符串并且内容相同返回true，否则false
 * 注意事项：
 * 1. 任何对象都可以使用equals
 * 2. equals方法具有对称性，也就是说a.equals(b)和b.equals(a)一样
 * 3. 如果比较双方一个常量一个变量，推荐吧常量字符串写在前面。
 * 推荐：str5.equals(str1) 不推荐：str5.equals("abc")
 *
 * public boolean equalsIgnoreCase(String str) //忽略大小写，进行内容比较.Ignore=忽略 Case=大小写
 */

public class Demo01StringEquals {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArrary = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArrary);

        System.out.println(str1.equals(str2)); // 内容比较 // true
        System.out.println(str2.equals(str3)); // true
        System.out.println(str3.equals("Hello")); // true
        System.out.println("Hello".equals(str1)); // true

        String str4 = "hello";
        System.out.println(str1.equals(str4)); // false 大小写H
        System.out.println("===============");

        String str5 = null;
        System.out.println("abc".equals(str5)); // 推荐：false
//        System.out.println(str5.equals("abc")); // 不推荐： str5 == null;报错：控制真异常NullPointerExption
        System.out.println("===============");

        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB)); // false
        System.out.println(strA.equalsIgnoreCase(strB)); // true 忽略大小写

        // 主要：只有英文字符忽略大小写，其他不区分大小写。English 大法好qwq
        System.out.println("abc一123".equalsIgnoreCase("abc壹123"));

    }

}
