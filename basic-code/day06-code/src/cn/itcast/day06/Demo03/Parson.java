package cn.itcast.day06.Demo03;

/**
 * 2018-9-29
 * 问题描述：定义Person的年龄时，无法阻止不合理的数值被设置
 * 解决方案：使用private关键字将需要保护的成员变量进行修饰
 *
 * 一旦使用了private进行修饰，那么本类当中仍然可以随意访问
 * 但是！超出了本类范围之外则不能直接访问
 *
 * 间接访问private就是定义一对Getter/Setter方法
 * public void setXyy(type xx) xyy = xx 无返回值  有参数和成员变量对应
 * public type getXyy() return xyy      无参数    有返回值和成员变量对应
 *
 */

public class Parson {

    String name; // 姓名
    private int age; // 年龄

    public void show() {
        System.out.println("Name: " + name + "\n" + "Age: " + age);
    }

    // 此成员方法用来向age设置数据
    public void setAge(int num) {
        if (num < 100 && num >= 1) {
            age = num;
        } else {
            System.out.println("数据不合理");
        }
    }

    public int getAge() {
        return age;
    }

}
