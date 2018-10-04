package cn.itcast.day06.Demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * 2018-9-30
 *
 * 题目：
 * 定义一个大集合存储20个随机数字，然后筛选其中的偶数元素，放到小集合中
 * 要求：使用自动一的方法来实现
 *
 * 分析：
 * 1. 需要创建一个集合来存储随机int数字:<Integer>
 * 2. 随机数在使用Random nextInt
 * 3. 循环20次，把随机数字放入大集合，for循环，add方法
 * 4. 自定义一个方法进行筛选
 * 筛选：根据大集合筛选符合要求的元素，得到小集合
 * 三要素
 * 返回值类型:ArrayList小集合（元素不确定）
 * 方法名称:getSmallList
 * 参数列表:ArrayList大集合 存储了20个随机数字
 * 5. 判断（if）是偶数, num % 2 == 0
 * 6. 如果是偶数放到小集合中
 *
 */

public class Demo04ArrayListReturn {

    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = new Random().nextInt(100) + 1; // 1-100
            bigList.add(num);
        }

        System.out.println("共有随机数字多少个：" + bigList.size());
        for (int i = 0; i < bigList.size(); i++) {
            System.out.print(bigList.get(i) + " ");
        }


        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.println("\n共有偶数多少个：" + smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.print(smallList.get(i) + " ");
        }

    }

    // 接受大参数集合，返回小集合结果（偶数）
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {
        //创建一个小集合用来装偶数结果
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if (num % 2 == 0) {
                smallList.add(num);
            }
        }
        return smallList;
    }

}
