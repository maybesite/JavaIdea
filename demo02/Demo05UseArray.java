package edition.demo02;

public class Demo05UseArray {
    public static void main(String[] args) {
        /*使用动态初始化数组时，其中的元素将会自动的拥有一个默认值
         * 1.整数类型 默认是0
         * 2.浮点类型 默认是0.0
         * 3.字符类型 默认是'\u0000'
         * 4.布尔类型 默认false
         * 5.引用类型 默认null
         * */
        int[] ArrayA = new int[5];
        for (int i : ArrayA)
            System.out.println(i);
        for (int i = 0; i < 5; i++) {
            System.out.println(ArrayA[i]);

        }
    }
    /*
Java的内存划分为5个部分：
1.栈(Stack):存放的都是局部变量。方法的运行一定在栈当中运行
    局部变量：方法的参数 或者是方法{}内部的变量
    作用域：一旦超出作用域，立刻从栈内存当中消失
2.堆(Heap)：凡是new出来的东西，都在堆里面。
   堆内存里面的东西都有一个地址：16进制
   堆内存里面的数据，都有默认值 0 false....
3.方法区(Meethod) 存储class相关信息，包括方法的信息
4.本地方法栈：与操作系统有关
5.寄存器：与cpu相关*/
}
