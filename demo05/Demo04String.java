package edition.demo05;
//程序中所有的双引号字符串，都是String类的对象(没有new，也是)
/*字符串的三个特点
* 1.字符串的内容永不可改变。
* 2.因为字符串的内容不可改变，所以字符串的内容是共享的
* 3.字符串效果上相当于char[]字符数组 但底层原理是byte[] 字节数组
* 创建字符串的常见3+1种方式
* public String();创建一个空白字符串 不含有任何内容
* public String(char[] array);根据字符数组的内容 创建对应的字符串
* public String(byte[] array) 根据字节数组的内容 创建对应的字符串
* 直接创建
* String s="sssss";jdk会自动new */
public class Demo04String {
    public static void main(String[] args) {
        String s="Hello world";
        String s1=new String("哈哈哈");
        String s2=new String();
        String s3="";
        char[] array={'a','b','c'};
        String s4=new String(array);
        System.out.println(s4);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("===");
        System.out.println(s3);
        System.out.println("====");

    }
}
