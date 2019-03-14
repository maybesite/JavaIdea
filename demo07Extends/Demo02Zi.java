package edition.demo07Extends;
/*继承关系中 父子类构造方法的访问特点：
* 1.子类构造方法当中有一个默认隐含的super()调用 所以一定是先调用父类构造
* 后执行子类构造
* 2.子类构造可以通过super关键字来调用父类重载构造
* 3.super的父类构造调用 必须是子类构造方法的第一个语句，不能一个子类调用多个super
*总结：
* 子类必须调用父类的构造柱方法 不写则赠送super() 对应父类的无参构造函数
* 父类的构造方法若有参数 必须调用super(****);写了则用写的指定的super调用
* super只能有一个 必须一个*/
public class Demo02Zi extends Demo02Fu {
    public Demo02Zi(int age){
        super(age);
        System.out.println("子类的构造方法");
    }
    public void method(){
        super.method();
        System.out.println("子类的方法");
    }
}
