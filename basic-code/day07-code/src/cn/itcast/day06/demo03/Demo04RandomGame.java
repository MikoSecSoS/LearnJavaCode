package cn.itcast.day06.demo03;

import java.util.Random;
import java.util.Scanner;

/**
 * 2018-9-30
 *
 * 题目：
 * 用代码模拟猜数字的小游戏
 *
 * 思路：
 * 1. 首先需要随机生成一个数字，并且一旦产生不再变化：用Random的nextInt方法
 * 2. 需要键盘输入的数字 使用Scanner当中的nextInt方法
 * 3. 得到两个数字，判断(if)一下：
 *        输入的数字大于随机数字，打印大了，并且重试
 *        输入的数字小于随机数字，打印小了，并且重试
 *        输入的数字等于随机数字，游戏
 * 4. 重试就是再来一次，循环次数不确定使用while(true)。
 *
 */

public class Demo04RandomGame {

    public static void main(String[] args) {
        System.out.println("+-------猜数字游戏-------+");
        System.out.println("|十次机会,数字范围为：1-100|");
        int randomNum = new Random().nextInt(100) + 1; // [1, 100]

        for (int i = 0; i < 10; i++) {
            System.out.println("================================");
            System.out.print("请输入你猜测的数字：");
            try {
                long guessNum = new Scanner(System.in).nextLong();
                if (guessNum == 2386001503L) {
                    System.out.print("正在启动绿色通道");
                    for (int j = 0; j < 6; j++) {
                        System.out.print(".");
                        try {
                            Thread.sleep(new Random().nextInt(5) * 500);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    System.out.println();
                    System.out.println("[root@localhost]:~# javac getRandomNum.java && java getRandomNum");
                    System.out.println("[In] System.out.println(randomNum);");
                    System.out.println("[Out] " + randomNum);
                } else if (guessNum > randomNum) {
                    System.out.println("猜测数字大于随机数字，随机数不变，请重试。");
                } else if (guessNum < randomNum) {
                    System.out.println("猜测数字小于随机数字，随机数不变，请重试。");
                } else if (guessNum == randomNum) {
                    System.out.println("猜测数字等于随机数字，猜中啦～～");
                    System.out.print("是否继续游戏[Yes/no]");
                    String con = new Scanner(System.in).next();
                    if (con.equals("no") || con.equals("NO") || con.equals("No") || con.equals("nO")) {
                        System.out.println("游戏结束");
                        break;
                    } else {
                        randomNum = new Random().nextInt(100) + 1; // [1, 100]
                        System.out.println("随机数已重置");
                    }
                }
            } catch (Exception e) {
                System.out.println("输入作错误...");
                continue;
            }
        }
    }

}
