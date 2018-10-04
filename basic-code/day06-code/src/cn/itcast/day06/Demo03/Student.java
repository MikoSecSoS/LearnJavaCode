package cn.itcast.day06.Demo03;

/**
 * 2018-9-29
 *
 * 对于基本类型的boolean值，Getter方法要写为isXxx形式，setXxx不变
 */

public class Student {

    private String name; // 姓名
    private int age; // 年龄
    private boolean male; // 性别

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }

    public void setMale(boolean b) {
        male = b;
    }

    public boolean isMale() {
        return male;
    }

}
