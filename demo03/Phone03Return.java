package edition.demo03;
//使用对象作为方法的返回值
public class Phone03Return {
    public static void main(String[] args) {
        //当使用一个对象作为方法的返回值时
        //返回值其实就是对象的地址值
        Phone two=getphone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }
    public static Phone getphone(){
        Phone one=new Phone();
        one.brand="vivo";
        one.color="深灰";
        one.price=8848.66;
        //地址值
        System.out.println(one);
        return one;
    }
}
