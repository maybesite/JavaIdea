package edition.demo09Interface;
/*1.接口的默认方法，可以通过接口实现类对象，直接调用
* 2.接口的默认方法，可以被接口实现类进行覆盖重写*/
public class MyinterfaceDefaultimpl implements MyinterfaceDefault {


    @Override
    public void methodA() {
        System.out.println("实现了抽象方法");
    }

//    @Override
//    public void method() {
//        System.out.println("实现了默认方法");
//    }

    public static void main(String[] args) {
        MyinterfaceDefaultimpl md=new MyinterfaceDefaultimpl();
        //调用默认方法 如果实现类当中没有，会向上找借口
        md.method();
        //调用抽象类方法 实际运行的是右侧实现类
        md.methodA();
    }
}
