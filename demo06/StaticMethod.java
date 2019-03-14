package edition.demo06;
/*注意事项：
* 1.静态方法不能直接访问非静态
* 原因：因为在内存当中是先有的静态内容 后有的非静态内容
* 现人不知道后人  但后人知道先人
* 2.静态方法当中不能使用this
* 原因：this代表当前对象，通过谁调用的方法，谁就是对象。 静态方法和对象没有一点关系*/
public class StaticMethod {
    public static void main(String[] args) {
        MyclassStaticMethod one=new MyclassStaticMethod();
        one.method();
        one.method1();
        MyclassStaticMethod.method1();
        //对于本类当中的静态方法，可以省略类名称
        StaticMethod.mymethod();//完全等效
        mymethod();
    }
    public static void mymethod(){
        System.out.println("自己的方法");
    }
}
