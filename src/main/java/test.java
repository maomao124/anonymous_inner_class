/**
 * Project name(项目名称)：匿名内部类
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/14
 * Time(创建时间)： 20:25
 * Version(版本): 1.0
 * Description(描述)： 匿名类是指没有类名的内部类，必须在创建时使用 new 语句来声明类
 * 这种形式的 new 语句声明一个新的匿名类，它对一个给定的类进行扩展，或者实现一个给定的接口。使用匿名类可使代码更加简洁、紧凑，模块化程度更高。
 * 匿名类有两种实现方式：
 * 继承一个类，重写其方法。
 * 实现一个接口（可以是多个），实现其方法。
 * 匿名类有如下特点：
 * 1）匿名类和局部内部类一样，可以访问外部类的所有成员。如果匿名类位于一个方法中，则匿名类只能访问方法中 final 类型的局部变量和参数。
 * 2）匿名类中允许使用非静态代码块进行成员初始化操作。
 * 3）匿名类的非静态代码块会在父类的构造方法之后被执行。
 */

public class test
{
    public void show()
    {
        System.out.println("调用show方法");
    }
}

class test1
{
    public void show()
    {
        test t = new test()
        {
            public void show()
            {
                System.out.println("调用匿名类中的 show() 方法");
            }
        };
        t.show();
    }

    public static void main(String[] args)
    {
        int a = 11;
        final int b = 12;
        test1 t2 = new test1();
        t2.show();
        test1 t = new test1()
        {
            public void show()
            {
                System.out.println(a);
                System.out.println(b);
            }
        };
        t.show();
    }
}
