package edition.demo04;

import java.util.Scanner;
//获取 键盘输入的一个int数字：int num=sc.nextInt()；
//获取的都是字符串nextInt把字符串转换成了数字类型
//获取 键盘输入的一个字符串：String s=sc.next();
public class Scannerdemo02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        System.out.println(t);
        String s=sc.next();
        System.out.println(s);
    }
}
