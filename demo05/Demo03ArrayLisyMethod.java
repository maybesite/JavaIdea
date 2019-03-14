package edition.demo05;

import java.util.ArrayList;
/*Arraylist当中常用的方法：
* public boolean add(E e)
* public E get(int index)
* public E remove(int index)
* public int size()*/
public class Demo03ArrayLisyMethod {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Hello");
        boolean t=list.add("World");
        System.out.println("添加是否成功 "+t);
        String s=list.get(0);
        System.out.println("得到的元素"+s);
        String r=list.remove(0);
        System.out.println("删除的元素"+r);
        int num=list.size();
        System.out.println("得到数组的长度"+num);
        list.add("hhh");
        list.add("333");

        //遍历集合
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
