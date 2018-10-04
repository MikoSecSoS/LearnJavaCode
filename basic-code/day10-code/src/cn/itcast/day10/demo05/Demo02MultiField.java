package cn.itcast.day10.demo05;

/**
 * 2018-10-3
 *
 * 在多态的代码当中，成员变量的访问规则是：
 *     看new的是谁，就有限用谁，没有则向上找
 *
 * 口诀：编译看左边，运行看右边
 *
 * 对比一下
 * 成员变量：编译看左边，运行还看左边
 * 成员方法：编译看左边，运行看右边
 *
 */

public class Demo02MultiField {

    public static void main(String[] args) {
        Fu obj = new Zi(); // 多态

        obj.method(); // 父子都有，new的子，优先用子
        obj.methodFu(); // 子类没有，向上找，父类有
        
        // 编译看左边，左边是Fu，Fu类当中没有methodZi方法，所以编译报错
//        obj.methodZi(); // 错误写法

    }

}
