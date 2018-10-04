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
 * static content > not static content
 *
 * static code chunk uses:
 * yi ci xing dui static member variable jin xing fu zhi
 *
 *
 */

public class Demo04Static {

    public static void main(String[] args) {
        Person one = new Person(); // first run static ,second run construciton
        // static code chunk not run twice.
        Person two = new Person(); // first run construciton
    }

}
