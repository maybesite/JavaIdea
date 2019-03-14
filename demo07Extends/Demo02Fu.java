package edition.demo07Extends;
/*super关键字的用法有三种:
* 1.在子类的成员方法中，访问父类的成员变量
* 2.在子类的成员方法中 访问父类的成员方法
* 3.在子类的构造方法中 访问父类的构造方法*/
public class Demo02Fu {
    int age;
    public Demo02Fu(){
        System.out.println("无参的父类的构造方法");
    }
    public Demo02Fu(int age){
        this.age=age;
        System.out.println("有参的父类的构造方法"+age);
    }
    public void method(){
        System.out.println("父类的方法");
    }
}
