package cn.itcast.day11.demo07;

/**
 * 2018-10-4
 *
 */

public class DemoGame {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("熊二"); // 设置英雄的名称

        // 设置英雄的技能
//        hero.setSkill(new SkillImpl()); // 使用单独定义的实现类

        // 使用匿名内部类
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("Pia-pia-pia~");
//            }
//        };
//        hero.setSkill(skill);

        // 进一步简化，同时使用匿名内部类，匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("Biu~Pia~Biu~Pia~");
            }
        });

        hero.attack();

    }

}
