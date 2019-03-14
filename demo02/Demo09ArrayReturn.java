package edition.demo02;

public class Demo09ArrayReturn {
    public static void main(String[] args) {
        //一个方法可以有多个参数，但返回值只能是0个或者1个；
        //产生多个数据进行返回，可以使用一个数组作为返回值
        //任何数据类型都能作为方法的参数类型，或者返回类型
        //数组作为方法的参数，传递进去的是数组的地址值
        //数组作为方法的返回值 返回的是数组的地址值
        int[] result=caulab(10,20,30);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result);
    }
    public static int [] caulab(int a,int b,int c){
        int sum=a+b+c;
        int arg=sum/3;
//        int [] ArrayA=new int[2];
//        ArrayA[0]=sum;
//        ArrayA[1]=arg;
        int[]ArrayA={sum,arg};
        return ArrayA;
    }
}
