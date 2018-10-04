package cn.itcast.day04.demo04;

/**
 * 2018-9-29
 * 方法的重载(OverLoad)：多个方法名称一样，但是参数列表不一样。
 * 好处：只需要记住唯一一个方法名称，就可以实现类似的功能
 *
 * 方法重载与下列因素相关
 * 1. 参数个数不同：sum(int a, int b) sum(int a, int b, int c)
 * 2. 参数类型不同：sum(double a, double b)
 * 3. 参数的多类型顺序不同：sum(int a, double b) sum(double a, int b)
 *
 * 方法重载于下列因素无关
 * 1. 与参数名无关：sum(int x, int y)  sum(int a, int b)
 * 2. 与方法的返回值无关 int sum(int a, int b) double sum(int a, int b) { return a + b}
 */
public class Demo01MethodOverload {

    public static void main(String[] args) {
/*        System.out.println(sumTwo(10, 20)); // 30
        System.out.println(sumThree(10, 20, 30)); // 60
        System.out.println(sumFour(10, 20, 30, 40)); // 100 */
        System.out.println(sum(10, 10));// 有2个参数的方法执行 20
        System.out.println(sum(10, 10, 10)); // 有3个参数的方法执行 30
        System.out.println(sum(10, 10, 10, 10)); // 有4个参数的方法执行 40
//        System.out.println(sum(10, 10, 10, 10, 10)); // 找不到拥有五个参数的sum方法，报错～
    }

/*    public static int sumTwo(int a, int b) {
        return a + b;
    }

    public static int sumThree(int a, int b, int c) {
        return a + b + c;
    }

    public static int sumFour(int a, int b, int c, int d) {
        return a + b + c + d;
    }*/

    public static int sum(int a, int b, int c) {
        System.out.println("有2个参数的方法执行");
        return a + b + c;
    }

    public static int sum(int a, int b) {
        System.out.println("有3个参数的方法执行");
        return a + b;
    }

    public static int sum(int a, int b, int c, int d) {
        System.out.println("有4个参数的方法执行");
        return a + b + c + d;
    }
}
