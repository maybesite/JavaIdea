package edition.demo09Interface;
/*不能通过接口实现类的对象来调用接口当中的静态方法
* 正确：接口名称.静态方法(参数)*/
public class MyinterfaceStaticimpl implements MyinterfaceStatic{


    public static void main(String[] args) {
//        MyinterfaceStaticimpl A=new MyinterfaceStaticimpl();
//      错误  A.methodstatic;
        //调用静态方法
        MyinterfaceStatic.methodstatic();
    }
}
