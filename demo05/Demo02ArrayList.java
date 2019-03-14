package edition.demo05;

import java.util.ArrayList;

public class Demo02ArrayList {
/*数组的长度不可以发生改变
* 但是ArrayList集合的长度是可以随意变化的。
* 对于ArrayList来说，有一个尖括号<E>代表泛型
* 泛型：也就是装在集合里面的元素，都是统一的类型
* 注意：泛型只能是引用类型，不能是基本类型
* 注意事项：
* 对于Array list集合来说 直接打印得到的不是地址值，而是内容。
* 如果内容为空，得到的是空的中括号[]*/
        public static void main(String[] args) {
    //创建了一个ArrayList集合，集合名称是list 里面装的全都是String字符串类型的数据
            ArrayList<String> list =new ArrayList<>();
            System.out.println(list);
            //向Array List中添加一些数据，需要用到add方法
            list.add("迪丽热巴");
            list.add("Hello");
            System.out.println(list);
            list.add("迪丽热巴");
            System.out.println(list);
}
}
