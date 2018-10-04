package cn.itcast.day11.demo03;

/**
 * 2018-10-4
 *
 */

public class Body { // 成员外部类

    public class Heart { // 成员内部类

        // 内部类方法
        public void beat() {
            System.out.println("心脏跳动：boom boom boom!");
            System.out.println("My Name is:" + name);
        }

    }

    // 外部类的成员变量
    private String name;

    public void methodBory() {
        System.out.println("外部类的方法");
//        Heart heart = new Heart();
//        heart.beat();
        new Heart().beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
