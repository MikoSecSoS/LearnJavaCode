package cn.itcast.day08.demo02;

/**
 * 2018-10-1
 *
 * {1, 2 ,3} --> [word#1word#2word#3]
 *
 * 1. int[] array
 * 2. Method
 * return: String
 * MethodName: fromArrayToString
 * parameter: int[]
 * 3. [word#1word#2word#3]
 * use: for, concat, word, #, if end
 * 4. use Method: get return value and print
 *
 *
 *
 */

public class Demo06StringPractise {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        String result = fromArrayToString(array);
        System.out.println(result);

    }

    public static String fromArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str += "word".concat(String.valueOf(array[i])).concat("]");
            } else {
                str += "word".concat(String.valueOf(array[i])).concat("#");
            }
        }
        return  str;
    }

}
