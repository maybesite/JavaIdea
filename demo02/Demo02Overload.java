package edition.demo02;

import java.sql.SQLOutput;

public class Demo02Overload {
    public static int sum(int a,int b){
        int c;
        c=a+b;
        return c;
    }
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        methon();
        methon(20);
        methon("ddd");
        methon(10,"hello");
        methon("hello",10);
    }
//  方法的重载(Overload)  //不同参数
/*与方法重载相关的因素
1.参数个数不同
2.参数类型不同
3.参数多类型顺序不同
与方法重载不想关的因素
1.与参数名称无关
2.与方法的返回值类型无关*/

/*
println 方法其实就是进行了多种数据类型的重载形式*/
    public static void methon(){
        for (int i = 0; i < 10; i++) {
            System.out.println("0");
        }
    }

    public static void methon(int x) {
        System.out.println(x);

    }
    public static void methon(String y){
        System.out.println(y);
    }
    public static void methon(int x,String y){
        System.out.println(x+y);
    }
    public static void methon(String x,int y){
        System.out.println(x+y);
    }

}
