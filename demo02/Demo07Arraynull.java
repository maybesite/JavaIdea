package edition.demo02;

public class Demo07Arraynull {
    public static void main(String[] args) {
//        所有引用类型都可以赋值null,但是代表其中什么都没有
        int [] ArrayA=null;
        System.out.println(ArrayA);
//        数组必须进行new初始化才能使用其中的元素
//        只赋值一个null，没有进行new创建，就会发生
//         空指针异常
//    错误    System.out.println(ArrayA[0]);
        int [] ArrayB=new int[]{1,2,3,};
        System.out.println(ArrayB[0]);
        int[] ArrayC={1,2,3,4};
        System.out.println(ArrayC[3]);
        System.out.println(ArrayC.length);
        int max=ArrayC[0];
//        for (int i = 0; i < ArrayC.length; i++) {
//            if(max<ArrayC[i])
//                max=ArrayC[i];
//        }
        System.out.println("======");
//        System.out.println(max);
//        数组元素反转
        int A=ArrayC.length;
        System.out.println(A);
        if(A%2==0){
            for (int i = 0; i <A/2 ; i++) {
                int t;
                t=ArrayC[A-1-i];
                ArrayC[A-1-i]=ArrayC[i];
                ArrayC[i]=t;

            }}
//        else{
//            for (int i = 0; i < A / 2 - 1; i++) {
//                ArrayC[i]=ArrayC[A-1];
//
//            }
//        }
        for(int x:ArrayC){
            System.out.println(x);
        }


    }
}
