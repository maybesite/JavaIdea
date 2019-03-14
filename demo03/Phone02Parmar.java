package edition.demo03;
//使用对象作为方法的参数
public class Phone02Parmar {
    public static void main(String[] args) {
        Phone one=new Phone();
        one.brand="222";
        one.price=8848.88;
        one.color="五彩";
        //传递进去的参数其实就是地址值
        //当有一个对象对位参数，传递到方法当中时
        //实际传递进去的是对象的地址值
        method(one);
    }
    public static  void method(Phone parmar){
        System.out.println(parmar.brand);
        System.out.println(parmar.price);
        System.out.println(parmar.color);
        System.out.println(parmar);  //地址值
    }
}
