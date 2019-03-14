package edition.demo05;
/*1.字符串常量池，程序中直接写上的双引号字符串，就在字符串常量池中 new的不在
* 对于基本类型来说 ==是进行数值比较
* 对于引用类型来说 ==是进行地址比较
* 2.字符串内容比较
* public boolean equals(Object obj) 参数可以是任何对象 只有参数是一个字符串
* 并且内容相同的时候才会true
* 注意事项：任何对象都能用Object进行接收
* 如果比较双方一个常量一个变量 推荐常量写在前面 "abc".equals(str)
* public boolean equalsIgnoreCase(String str)忽略大小写 进行内容比较*/
public class Demo05StringPool {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        char[] Array={'H','e','l','l','o'};
        String s3=new String(Array);
        System.out.println(s1==s2); //true
        System.out.println(s1==s3); //false
        System.out.println(s2==s3); //false

    }
}
