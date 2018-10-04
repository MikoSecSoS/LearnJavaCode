package cn.itcast.day05.demo02;

/**
 * 2018-9-29
 * 浅拷贝qwq呸呸呸，引用qwq引用emmmmmm
 */

public class Demo03ArraySame {

    public static void main(String[] args) {
        int[] arrayA = new int[3];
        System.out.println("+-----arrayB-----+");
        System.out.println(arrayA); // 地址值
        System.out.println(arrayA[0]); // 0  默认值
        System.out.println(arrayA[1]); // 0
        System.out.println(arrayA[2]); // 0
        System.out.println("================");

        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA); // 地址值 不变
        System.out.println(arrayA[0]); // 0  默认值
        System.out.println(arrayA[1]); // 10
        System.out.println(arrayA[2]); // 20
        System.out.println("================");

        // 将arrayA数组的地址值，复制给arrayB //0x9e
        int[] arrayB = arrayA;
        System.out.println("+-----arrayB-----+");
        System.out.println(arrayB); // 地址值
        System.out.println(arrayB[0]); // 0  默认值
        System.out.println(arrayB[1]); // 0
        System.out.println(arrayB[2]); // 0
        System.out.println("================");

        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB); // 地址值 不变
        System.out.println(arrayB[0]); // 0  默认值
        System.out.println(arrayB[1]); // 100
        System.out.println(arrayB[2]); // 200
        System.out.println("================");

        // arrayA也会变哦～
        System.out.println("int[] arrayB = arrayA 把arrayA的内存地址赋值给arrayB");
        System.out.println("下面打印arraA,上面已修改arrayB[1]为100,arrayB[2]为200");
        System.out.println("此时arrayA和arrayB都等于arrayA的内存空间，" +
                "所以修改arrayB就会去修改arrayA内存空间的数值");
        System.out.println("术语为“浅拷贝”emmmmm不对！Java貌似叫做“引用”");
        System.out.println(arrayA[0]); // 0
        System.out.println(arrayA[1]); // 100
        System.out.println(arrayA[2]); // 200

        /** 互不影响
         * 栈（Stack）：存放的都是方法中的局部变量。 方法的运行一定要在栈当中运行。
         * (2). main(String[] agrs) // duang~ 进栈,开辟main专用的内存空间
         * (3).     int[] arrayA(5). 在内存中名称 == 0xe9
         * (6). System.out.println(arrayA); // 去内存中寻找array的地址值0xe9
         * (7). System.out.println(arrayA[0]); // 找array的地址值0xe9,中的[0]里面的元素。
         * (8). arrayA[1]; arrayA[2]; // 同上
         * (9). arrayA[1] = 10; // 找arrayA的地址值0xe9,中的[1]里面的元素,元素为0。 = 10; 赋值为10
         * (10). arrayA[2] = 20; // 同上
         * (11). System.out.println(arrayA) // 找地址值
         * (12). System.out.println(arrayA[0]) // 找arrayA->0xe9->0xe9[0] 并没有进行过修改所以为0
         * (13). arrayA[1] arrayA[2] // 同上，不过值被修改过了所以打印修改后的值 10   20
         *
         * (14).     int[] arrayB(5). 在内存中名称 == 0xe9
         * (6). System.out.println(arrayB); // 去内存中寻找array的地址值0xe9
         * (7). System.out.println(arrayB[0]); // 找arrayB的地址值0xe9,中的[0]里面的元素。
         * (8). arrayB[1]; arrayB[2]; // 同上
         * (9). arrayB[1] = 10; // 找arrayB的地址值0x9e,中的[1]里面的元素,元素为0。 = 100; 赋值为100
         * (10). arrayB[2] = 20; // 同上
         * (11). System.out.println(arrayB) // 找地址值 0xe9
         * (12). System.out.println(arrayB[0]) // 找arrayB->0xe9->0xe9[0] 并没有进行过修改所以为0
         * (13). arrayB[1] arrayB[2] // 同上，不过值被修改过了所以打印修改后的值 100   200
         *
         * 堆（Heap）:凡是new出来的东西，都在堆当中
         * (4). new int[3]; // { [0]0, [1]0, [2]0 } == 16进制地址值 0xe9    0xe9=233  qwq
         * (4). new int[3]; // { [0]0, [1]0, [2]0 } == 16进制地址值 0xe9    0xe9=2333  qwq
         *
         * 方法区 （Method Area）：储存.class相关信息，包含方法的信息。// 信息在方法区中，运行！走你，进栈咯～
         * (1). public static void main(String[] args)
         *
         */
    }

}
