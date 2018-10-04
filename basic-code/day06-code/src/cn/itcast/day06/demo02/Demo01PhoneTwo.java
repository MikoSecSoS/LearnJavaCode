package cn.itcast.day06.demo02;

/**
 * 2018-9-29
 */

public class Demo01PhoneTwo {

    public static void main(String[] args) {

        Phone phone = new Phone();

        System.out.println(phone.brand); // null
        System.out.println(phone.price); // 0.0
        System.out.println(phone.color); // null
        System.out.println("==============");

        phone.brand = "西瓜";
        phone.price = 0.01;
        phone.color = "白色";
        System.out.println(phone.brand); // 西瓜
        System.out.println(phone.price); // 0.01
        System.out.println(phone.color); // 白色
        System.out.println("==============");

        phone.call("Cat");
        phone.sendMessage();
        System.out.println("==============");

        Phone phtwo = new Phone();

        System.out.println(phone.brand); // null
        System.out.println(phone.price); // 0.0
        System.out.println(phone.color); // null
        System.out.println("==============");

        phone.brand = "南瓜";
        phone.price = 0.02;
        phone.color = "黑色";
        System.out.println(phone.brand); // 南瓜
        System.out.println(phone.price); // 0.02
        System.out.println(phone.color); // 黑色
        System.out.println("==============");

        phone.call("Dog");
        phone.sendMessage();

    }

    /**
     * 两个new
     * 互不影响
     *
     * 一个phone一个new 另一个phtwo赋值phone (地址值)
     * phone(0x9e) = Phone()[0x333]
     * phtwo(0x9e) = phone(0x9e);
     * 0x9e 0x9e 0x9e
     *
     * 栈（Stack）
     * (3). main(String[] args) //进栈 压栈
     * (4). Phone phone  地址值——>0x9e
     * (6). phone.brand = "西瓜" phone->0x9e->brand = "西瓜"
     * (7). phone.call("Cat") phone->0x9e->call()->0x333 who = "Cat"
     * (8). call(String who) 进栈（压栈）   在main()的上方
     * (9). call("给" + who = "Cat" + "打电话") 执行完后出栈（弹栈） main()继续执行
     * (10). phone.sendMessage() 进栈（压栈） 在main()的上方
     * (13). Phone phtwo  地址值——>0x9d
     * (16). phone.brand = "南瓜" phone->0x9e->brand = "南瓜"
     * (17). phone.call("Dat") phone->0x333->call()->0x9d who = "Dat"
     * (8). call(String who) 进栈（压栈）   在main()的上方
     * (9). call("给" + who = "Dat" + "打电话") 执行完后出栈（弹栈） main()继续执行
     * (10). phone.sendMessage() 进栈（压栈） 在main()的上方
     * (11). println("群发短信") 出栈
     * (12).
     *
     * 堆（Heap）
     * (5). new Phone(); 变量在堆中-成员变量 值(null); 成员方法 地址值->指向方法区 == 0x9e  Phone == 0x333
     * (11).new Phone(); 变量在堆中-成员变量 值(null); 成员方法 地址值->指向方法区 == 0x9d  Phone == 0x333
     *
     *
     * 方法区（Method Area）
     * (1). Phone.class{//成员变量 ... 成员方法......}
     * (2). Demo01PhoneOne.class {main(String[] args)}
     * (2.5). Demo01PhoneTwo.class {main(String[] args)}
     *
     */

}
