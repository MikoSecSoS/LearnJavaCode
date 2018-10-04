package cn.itcast.day06.demo02;

/**
 * 2018-9-29
 */

public class Demo01PhoneOne {

    public static void main(String[] args) {
        // 根据Phone类，创建一个名为phone的对象
        // 格式：类名称 对象名 = new 类名称();
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

        phone.call("Cat");
        phone.sendMessage();

    }

    /**
     * 栈（Stack）
     * (3). main(String[] args) //进栈 压栈
     * (4). Phone phone  地址值——>0x9e
     * (6). phone.brand = "西瓜" phone->0x9e->brand = "西瓜"
     * (7). phone.call("Cat") phone->0x333->call()->0x333 who = "Cat"
     * (8). call(String who) 进栈（压栈）   在main()的上方
     * (9). call("给" + who = "Cat" + "打电话") 执行完后出栈（弹栈） main()继续执行
     * (10). phone.sendMessage() 进栈（压栈） 在main()的上方
     * (11). println("群发短信") 出栈
     * (12). main()执行完毕 出栈  进程结束
     *
     * 堆（Heap）
     * (5). new Phone(); 在堆中-成员变量 值; 成员方法 地址值->指向方法区 == 0x9e  Phone == 0x333
     *
     * 方法区（Method Area）
     * (1). Phone.class{//成员变量 ......}
     * (2). Demo01PhoneOne.class {main(String[] args......)}
     *
     */

}
