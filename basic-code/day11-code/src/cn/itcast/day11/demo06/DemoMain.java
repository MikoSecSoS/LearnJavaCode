package cn.itcast.day11.demo06;

/**
 * 2018-10-4
 *
 */

public class DemoMain {

    public static void main(String[] args) {
        // 创建一个英雄
        Hero hero = new Hero();
        // 为英雄其一个名字，并且设置年龄
        hero.setName("熊大");
        hero.setAge(15);

        // 创建一个武器对象
        Weapon weapon = new Weapon("雪球");
        // 给英雄武器
        hero.setWeapon(weapon);

        hero.attack();

    }

}
