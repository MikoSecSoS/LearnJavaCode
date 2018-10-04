package cn.itcast.day06.demo02;

/**
 * 2018-9-29
 */

public class Demo04PhoneParam {

    public static void main(String[] args) {

        Phone phone = new Phone();
        phone.brand = "苹果";
        phone.price = 0.110;
        phone.color = "绿色";

        method(phone);

    }

    public static void method(Phone param) {
        System.out.println(param.brand); // 苹果
        System.out.println(param.price); // 0.110
        System.out.println(param.color); // 绿色
    }

    /**
     * 当一个对象作为参数，传递到方法中时
     * 实际上传递进去的是对象的地址值，地址值，地址值。
     *
     * 栈（Stack）
     * (3). main(String[] args) // 进栈
     * (4). Phone phone
     * (6). phone.brand = "苹果"; phone->0x9e->brand = "苹果"
     * (7). method(phone); // 进栈 method(phone[0x9e])
     * (9). println(param.brand) param->phone[0x9e]->0x9e.brand
     *
     * 堆（Heap）
     * (5). new Phone() 变量在堆中-成员变量 值(null); 成员方法 地址值->指向方法区 == 0x9e  Phone == 0x333
     *
     * 方法区（Method Area）
     * (1). Phone.class{//成员变量 ... //成员方法.....}
     * (2). Demon04Phoneparam.class {main(String[] args)}
     * (8). Demon04Phoneparam.class {method(Phone param)}
     *
     */

}
