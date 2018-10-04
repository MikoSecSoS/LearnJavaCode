package cn.itcast.day06.demo02;

/**
 * 2018-9-29
 */

public class Demo04PhoneReturn {

    public static void main(String[] args) {

        Phone phtwo = getPhone();

        System.out.println(phtwo.brand);
        System.out.println(phtwo.price);
        System.out.println(phtwo.color);

    }

    public static Phone getPhone() {
        Phone phone = new Phone();
        phone.brand = "苹果";
        phone.price = 0.110;
        phone.color = "红色";
        return phone;
    }

    /**
     * 当一个    对象  类型作为方法的返回时：
     * 返回值就是 对象  的地址值
     *
     * 栈（Stack）
     * (3). void main(String[] args) // 进栈
     * (4). Phone getPhone(phone); // 进栈 method(phone[0x9e])
     * (6). phone.brand = "苹果"; phone->0x9e->brand = "苹果"
     * (7). return phone[0x9e]
     * (5). Phone phtwo = getPhone(); 地址值——>0x9e
     * (8). println(two.brand) param->phone[0x9e]->0x9e.brand
     * (9). main()执行完毕 出栈  进程结束
     *
     * 堆（Heap）
     * (5). new Phone() 变量在堆中-成员变量 值(null); 成员方法 地址值->指向方法区 == 0x9e  Phone == 0x333
     *
     * 方法区（Method Area）
     * (1). Phone.class{//成员变量 ... //成员方法.....}
     * (2). Demon04PhoneReturn.class {main(String[] args)}、
     *
     */

}
