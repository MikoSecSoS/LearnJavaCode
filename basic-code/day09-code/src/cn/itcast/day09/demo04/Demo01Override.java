package cn.itcast.day09.demo04;

/**
 * 2018-10-2
 *
 * 方法覆盖重写的注意事项：
 * 1.必须保证父子类之间的方法名称相同
 * @Override: 写在方法前面，用来检测是不是有效的方法正确覆盖重写。
 * 注解就算不写，只要满足要求，也是正确的方法覆盖重写
 *
 * 2.子类方法的返回值必须小于等于父类方法的返回值范围。
 * 小扩展提示：java.lang.Object类是所有公共类的最高父类（祖宗类），java.lang.String就是Object的子类
 *
 * 3.子类方法的权限必须大于等于父类的方法权限修饰符
 * 小扩展提示：public > protected > (default) > private
 * 备注：(default)不是关键字default 而是什么都不写：留空
 *
 *
 */

public class Demo01Override {

}
