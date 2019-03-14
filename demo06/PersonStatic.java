package edition.demo06;

public class PersonStatic {
    //静态方法块
    //特点：当第一次用到本类时，静态方法块执行唯一的一次。
    //静态内容总是优先于非静态，所以静态代码块比构造方法先执行
    //静态代码块的典型用途
    //用来一次性的对静态成员变量进行赋值
    static {
        System.out.println("静态代码块执行！");
    }
    public PersonStatic(){
        System.out.println("构造方法执行");
    }

}
