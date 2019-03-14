package edition.demo07Extends;
/*区分子类方法中重名的三种变量
* 局部变量：直接写成成员变量名
* 本类的成员变量 this.成员变量
* 父类的成员变量 super.成员变量*/
public class Demo01Zi extends Demo01Fu {
    int numzi=20;
    int num=200;
/*方法覆盖重写注意事项：
* 1.必须保证父子类之间方法的名称相同，参数列表也相同
* @override :写在方法的前面 用来检测是不是有效的正确覆盖重写
* 2.子类方法的返回值必须小于等于 父类方法的返回值范围
* 3.子类方法的权限必须大于等于父类方法的权限修饰符
* public>protect>default>private*/
    public void method(){
        int num=66; //局部变量
        System.out.println(this.num); //本类成员变量
        System.out.println(super.num); //父类成员变量
    }
}
