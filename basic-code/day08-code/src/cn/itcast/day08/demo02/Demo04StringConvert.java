package cn.itcast.day08.demo02;

/**
 * 2018-10-1
 *
 * public char[] toCharArry(); "Miko", 'M','i','k','o'
 * public byte[] getBtyes(); "abc", {97, 98, 99}
 * public String replace(CharSequence oldString, CharSequence newString);
 * "I love Miko."replace("Miko", "Java"); return "I love Java"
 *
 *
 */

public class Demo04StringConvert {

    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]); // H
        System.out.println(chars.length); // 5
        System.out.println("=======================");

        byte[] bytes = "abc".getBytes();
        System.out.println(bytes[0]);
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        String str1 = "How do you du?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1); // How do you do?
        System.out.println(str2); // H*w d* y*u d*?
        System.out.println("=========================");

        String lang1 = "I fuck you. fuck fuck fuck you qwq";
        String lang2 = lang1.replace("fuck", "love");
        System.out.println(lang2); // I love you. love love love you qwq

    }

}
