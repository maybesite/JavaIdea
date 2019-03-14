package edition.demo04;

import java.util.Scanner;

/*创建对象的标准格式
* 类名称 对象名=new 类名称();
* 匿名对象就是 只有右边的对像，没有左边的名字和赋值运算符
* new 类名称();
* 注意对象：匿名对象只能使用唯一的一次，下次再用不得不再创建一个新的对象
* 使用建议：如果确定有一个对象只需使用唯一的一次，就可以使用匿名对象*/
public class Anonymousdemo03 {
    public static void main(String[] args) {
//        Anonymous01 one=new Anonymous01();
//        one.name="高圆圆";
//        one.showname();
//        //匿名对象
//        new Anonymous01().name="哈哈";
//        new Anonymous01().showname();
        //普通使用方式
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
        //匿名对象使用方式
//        int num=new Scanner(System.in).nextInt();
//        System.out.println(num);
        //使用一般写法传入参数
        /*Scanner sc=new Scanner(System.in);
        methodparam(sc);*/
        //使用匿名函数传参
//        methodparam(new Scanner(System.in));
//      匿名对象作为返回值
        Scanner one=methodReturn();
        int num=one.nextInt();
        System.out.println(num);
        }
    public  static void methodparam(Scanner sc){
        int num=sc.nextInt();
        System.out.println(num);
    }
    public static Scanner methodReturn(){
        return(new Scanner(System.in));
    }
}
