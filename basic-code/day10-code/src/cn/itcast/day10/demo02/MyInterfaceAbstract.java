package cn.itcast.day10.demo02;

/**
 * 2018-10-3
 *
 */

public abstract class MyInterfaceAbstract implements MyInterfaceA, MyInterfaceB {

    @Override
    public void methodA() {
    }

    @Override
    public void methodAbs() {

    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口当中冲突的默认方法进行覆盖重写Abstract");
    }

}
