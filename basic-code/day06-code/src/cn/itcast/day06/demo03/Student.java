package cn.itcast.day06.demo03;

/**
 * 2018-9-29
 *
 * 类：是一组相关属性和行为的集合，可以看作是一类事物的模板，使用事物的属性特征和特征行为来描述该类事物
 *
 * 属性：该事物的状态信息
 * 行为：该事物能做什么
 *
 * 举例：Cat
 * 属性：名字，体重，年龄，颜色，胳膊腿
 * 行为：走，跑，叫，卖萌
 *
 * 类是对一类事物的描述，是抽象的。
 * 对象是一类食物的实例，是具体的。
 * 类是对象的模板，对象是类的实体。
 *
 * 类：图纸
 * 对象：实物
 *
 * 定义一个类，用来模拟“学生”事物，其中有两个部分组成：
 *
 * 属性（是什么）：
 *     姓名
 *     班级
 * 行为（能做什么：
 *     吃饭
 *     睡觉
 *     学习
 *
 * 对应到Java的类当中：
 *
 * 成员变量（属性）：
 *     String name; // 姓名
 *     int age; //年龄
 * 成员方法（行为）：
 *     public void eat() {} // 吃饭
 *     public void sleep() {} // 睡觉
 *     public void study() {} //学习
 *
 * 注意事项：
 * 1. 成员变量是直接定义在类当中的，方法之外
 * 2. 成员方法不要写static关键字
 *
 */
public class Student {

    // 成员变量
    String name;
    int age;

    // 成员方法
    public void eat() {
        System.out.println("次饭，嗷嗷～");
    } // 吃饭
    public void sleep() {
        System.out.println("睡觉zZzZzZ");
    } // 睡觉
    public void study() {
        System.out.println("学习(@^_^@)");
    } // 学习


}
