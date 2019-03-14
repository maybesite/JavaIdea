package edition.demo06;

import java.util.Arrays;

//题目：使用Arrays相关的API 将一个随机字符串中的所有字符升序 并倒序打印
public class Demo02ArraysPracterise {
    public static void main(String[] args) {
        String s="ufrhwbwhifhqofwohf";
        char[] r=s.toCharArray();
        Arrays.sort(r);
        for(int i=r.length-1;i>=0;i--){
            System.out.println(r[i]);
        }
    }


}
