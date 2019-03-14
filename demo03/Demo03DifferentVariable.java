package edition.demo03;
/*局部变量和成员变量
1.定义位置不一样
成员变量：方法内部
局部变量：方法外部 直接写在类里面
2.作用范围不一样
局部变量：在方法中才能使用 出来方法就使用不了
成员变量：整个类全都可以使用
3.默认值不一样
局部变量：没有默认值 如果想使用 必须手动赋值
成员变量：没有赋值 会有默认值 规则和数组一样
4.内存地址不一样
局部变量：位于栈内存
成员变量：位于堆内存
5.生命周期 不一样
*/
public class Demo03DifferentVariable {
    String name;  //成员变量
    public void methodA(){
        int num=20;  //局部变量
        System.out.println(num);
        System.out.println(name);
    }
    public void methodB(int param){  //方法参数就是局部变量
        System.out.println(param);
        int age;  //局部变量
        //错误写法
//        System.out.println(num);
        System.out.println(name);
    }
}
