package edition.demo07Extends;
//直接通过子类对象访问成员变量：
//    等号左边是谁，就优先用谁 没有则往上找
//间接通过成员方法访问成员变量
//   该方法属于谁 就优先用谁 没有就往上找
//在父子类的继承关系中，创建子类对象，访问成员方法的规则
// 创建的对象是谁 就优先用谁 如果没有则往上找
//成员方法还是成员变量 如果没有都是往上找父类 不会向下找子类
public class Demo01Test {
    public static void main(String[] args) {
        Demo01Fu one=new Demo01Fu();
        System.out.println(one.numfu);
        Demo01Zi two=new Demo01Zi();
        System.out.println(two.numzi);
        System.out.println(two.numfu);
        System.out.println(two.num);
        System.out.println("====");
        System.out.println(one.num);
        System.out.println("=====");
        two.method();
    }
}
