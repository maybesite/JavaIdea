package edition.demo05;
//字符串截取
//public String substring(int index) 截取从参数位置一直到字符串末尾，返回新字符串
//public String substring(int begin,int end) 截取从begin开始 一直到end结束 中间的字符串
//备注 [begin,end) 包含左边 不包含右边
public class Demo06StringGet {
    public static void main(String[] args) {
        //字符串长度
        int num="fhshgshgshg".length();
        System.out.println(num);
        //字符串拼接
        String s1="abc";
        String s2="def";
        String s3=s1.concat(s2);
        System.out.println(s3);
        System.out.println(s1);
        //获取指定索引位置的单个字符
        char ch="hello".charAt(1);
        System.out.println(ch);
        //查找某个元素首次出现的索引位置
        String s4="dfeafaf";
        System.out.println(s4.indexOf("f"));
        //字符串的截取
        String s5="Helloworld";
        System.out.println(s5.substring(5));
        System.out.println(s5.substring(2,5));
        //字符串的转换
//      public char[] toCharArray() 将当前字符串拆分成字符数组作为返回值
 //     public byte[] getBytes()  获得当前字符串底层的字节数组
 //     public String replace(CharSequence oldString,CharSequence newString)
//      将所有 出现的老字符串替换成新字符串，返回替换之后的结果新字符串
//CharSequence意思就是说可以接受字符串类型
        //转换成字符数组
        char[] Array="hfsehhf".toCharArray();
        for(int i=0;i<Array.length;i++){
            System.out.println(Array[i]);
        }
        //转换成字节数组
        byte[] ArrayA="abc".getBytes();
        for(int i=0;i<ArrayA.length;i++){
            System.out.println(ArrayA[i]);
        }
        //字符串的替换
        String s="你好 你好 ";
        String s6=s.replace("好","帅哥");
        System.out.println(s6);
        //分割字符串
        String s7="aaa,bbb,ccc";
        String[] s8 = s7.split(",");
        System.out.println(s8[0]);
        //正则表达式
        //split方法的参数其实是一个正则表达式
        //要使用.  需要用\\.
        String s9="ddd.eee.fff";
        String [] ss=s9.split("\\.");
        System.out.println(ss.length);


    }
}
