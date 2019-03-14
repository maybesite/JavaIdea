package edition.demo03;
//通常情况下，一个类并不能直接使用，需要根据类创建一个对象 才能使用  类方法不需要
//1.导包：指出所使用的类，在什么位置。
/*import 包名称.类名称
import demo03.Demo01Student
对于和当前类属于同一个包的情况，可以省略不写
只有java.lang包下的内容不需要导包，其他的包都需要import语句
2.创建 格式
类名称 对象名= new 类名称();
根据Student类 创建了一个名为stu的对象
3.使用其中的成员变量  对象名.成员变量
  使用其中的成员方法  对象名.成员方法
  */
public class Demo01Student {
    //成员变量是直接定义在在类当中的，在方法外面
    //成员变量只能对象调用  静态变量static


    String name= "帅哥";    //未定义 默认为null
    int age;               //未定义 默认未0
    public void play(){
        System.out.println(name);
    }
    public static String sleep(){
        return "哈哈哈哈";
    }
    public void setAge(){
        System.out.println(age);
    }




}
