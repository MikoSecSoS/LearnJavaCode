package cn.itcast.day08.demo02;

import java.util.Scanner;

/**
 * 2018-10-1
 *
 * keyboard input String, How many times did char show up
 * Class: Upper, Lower, number, other
 *
 * 1. Scanner().next();
 * 2. Four variable
 * 3. String-->char[] toCharArray()
 * 4. for, if class, variable ++
 * 5. print Variable
 *
 */

public class Demo07StringCount {

    public static void main(String[] args) {
        System.out.print("Please input String: ");
        String input = new Scanner(System.in).nextLine();

        int countUpper= 0; // Upper case
        int countLower = 0; // Lower case
        int countNumber = 0; // Number
        int countOther = 0; // Other Character

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i]; // Current single character
            if ('A' <= ch && ch <= 'Z') {
                countUpper++;
            } else if ('a' <= ch && ch <= 'z') {
                countLower++;
            } else if ('0' <= ch && ch <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }

        System.out.println("How many capital letters are there:" + countUpper);
        System.out.println("How many lowercase letters are there:" + countLower);
        System.out.println("How many numbres are there:" + countNumber);
        System.out.println("How many other character are there:" + countOther);


    }

}
