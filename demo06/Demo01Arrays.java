package edition.demo06;

import java.util.Arrays;
/*Arrays类里面提供了大量的静态方法 用来实现数组的常见操作
* public static String toString(数组) [元素1,元素2,元素3,...]
* public static void sort(数组) 从小到大对数组元素进行排序.
* 备注：
* 1.如果是数值 sort默认按照从小到大
* 2.如果是字母 sort默认按字母从小到大
* 3.如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持*/
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] ArrayA={10,20,30};
        String s= Arrays.toString(ArrayA); //将数组变成字符串
        System.out.println(s);
        int[] ArrayB={3,2,6,5,1,0};
        Arrays.sort(ArrayB); //直接排序 无返回值
        System.out.println(Arrays.toString(ArrayB));
    }
}
