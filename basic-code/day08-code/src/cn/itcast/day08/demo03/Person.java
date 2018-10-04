package cn.itcast.day08.demo03;

/**
 * 2018-10-1
 *
 * Static Code Chunk:
 * public Class ClassName{
 *     static {
 *         // Static Code Chunk Content
 *     }
 * }
 *
 * first use current class, static code chunk run | Second use current class not run static code chunk
 *
 */

public class Person {

    static {
        System.out.println("Static Code Chunk run");
    }

    public Person() {
        System.out.println("Construciton method run");
    }

}
