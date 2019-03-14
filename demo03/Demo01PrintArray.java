package edition.demo03;

import java.util.Arrays;

public class Demo01PrintArray {
    public static void main(String[] args) {
        int []ArrayA=new int[]{10,20,30,40,50};
        System.out.print("[");
        for (int i = 0; i < ArrayA.length; i++) {

            System.out.print(ArrayA[i]);
            if(i<ArrayA.length-1)
                System.out.print(",");
        }
        System.out.println("]");
        System.out.println("===========");
        //使用面对对象
        //找一个JDk给我们提供的Arrays类
        //toString 方法把数组转换成格式的字符串
        System.out.println(Arrays.toString(ArrayA));
        System.out.println("调用类");
        System.out.println(Demo01Student.sleep());
        Demo01Student student=new Demo01Student();
        student.play();
        student.setAge();
        System.out.println("=======");
        System.out.println(student.age);
        System.out.println(student.name);
        System.out.println("=======");
        student.age=20;
        System.out.println(student.age);

    }
}
