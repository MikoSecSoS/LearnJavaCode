package cn.itcast.day08.demo02;

/**
 * 2018-10-1
 *
 * public String[] split(String regex);
 *
 */


public class Demo05StringSplit {

    public static void main(String[] args) {
        String str1 = "Hello,World,qwqwqwqwq";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[1]);
        }
        System.out.println("================");

        String str2 = "Hello Java Me is Miko.";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("================");

        String str3 = "XXX.YYY.ZZZ";
        String[] arrary3 = str3.split(".");
        System.out.println("array3 length: " + arrary3.length);
        for (int i = 0; i < arrary3.length; i++) {
            System.out.println(arrary3[i]);
        }
        System.out.println("====================");


        // parameter is regex
        String str4 = "XXX.YYY.ZZZ";
        String[] arrary4 = str4.split("\\.");
        System.out.println("array3 length: " + arrary4.length);
        for (int i = 0; i < arrary4.length; i++) {
            System.out.println(arrary4[i]);
        }
        System.out.println("===================");

        String str5 = "Hello1World2Hello3Java";
        String[] arrary5 = str5.split("\\d+");
        System.out.println("array4 length: " + arrary5.length);
        for (int i = 0; i < arrary5.length; i++) {
            System.out.println(arrary5[i]);
        }

    }

}
