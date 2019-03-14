package edition.demo07Extends;
/*super关键字用来访问父类内容 而this关键字用来访问本类内容。
* 1.在本类的成员方法中，访问本类的成员变量
* 2.在本类的成员方法中，访问本类的另一个成员方法
* 3.在本类的构造方法中，访问本类的另一个构造方法*/
public class Demo03Zi extends Demo03Fu {
    int num=20;
    public Demo03Zi(){
        //super 不再赠送
        this(123); //本类的无参构造，调用本类的有参构造
    }
    public Demo03Zi(int n){
        this(123,456);
        System.out.println(n);
    }
    public Demo03Zi(int n,int m){
        System.out.println(n+m);
    }
    public void showNum(){
        int num=10;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
    public void methodA(){
        System.out.println("AAA");
    }
    public void methodB(){
        this.methodA();
    }
}
