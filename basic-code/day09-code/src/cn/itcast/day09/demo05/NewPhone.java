package cn.itcast.day09.demo05;

/**
 * 2018-10-2
 *
 * 定义一个新手机，使用老手机作为父类
 *
 */

public class NewPhone extends Phone {

    @Override
    public void show() {
        super.show(); // 重复利用父类show方法
        // 添加的新方法
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
