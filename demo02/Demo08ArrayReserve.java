package edition.demo02;

public class Demo08ArrayReserve {
    public static void main(String[] args) {
        int [] ArrayB=new int []{1,2,3,4,5,6};
        //数组可以作为方法的参数
        //当调用方法的时候，用方法的小括号进行传参，传递进去的是数组的地址
        printf(ArrayB);
        System.out.println("=======");
    }
    public static void printf(int [] ArrayB){
        System.out.println("参数地址");
        System.out.println(ArrayB);
        for(int x:ArrayB){
            System.out.println(x);
        }

    }
}
