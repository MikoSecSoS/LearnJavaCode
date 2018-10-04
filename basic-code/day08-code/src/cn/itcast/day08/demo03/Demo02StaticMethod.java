package cn.itcast.day08.demo03;

/**
 * 2018-10-1
 *
 * use static method,this static method, static method not is object, is class
 *
 * not is static method: create object --> use
 * is static method: not create object,  use class name
 *
 * Use static variable or static Method()
 * static variable: MyClassName.Myxxx;
 * static method(): MyClassName.method();
 *
 */

public class Demo02StaticMethod {

    public static void main(String[] args) {

        MyClass obj = new MyClass(); //create object
        // use not is static method
        obj.method();

        // static use object name or use class name
        obj.methodStatic(); // true // rong yi wu jie wei cheng yuan fang fa
        // javac -->  obj.methodStatic(); --> Myclass.methodStatic();

        MyClass.methodStatic(); // true this good

        myMethod(); // ke yi sheng lue class name
        // javac --> Demo02StaticMethod.myMethod();

        Demo02StaticMethod.myMethod();


    }

    public static void myMethod() {
        System.out.println("My method");
    }

}
