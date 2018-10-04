package cn.itcast.day10.demo01;

/**
 * 2018-10-3
 *
 */

public class MyInterfacePrivateAImpl implements MyInterfacePrivateA {

    public void methodAnother() {
        // 直接访问到了接口中的默认方法，这是错误的。
//        methodCommon();
    }

}
