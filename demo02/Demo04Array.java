package edition.demo02;

public class Demo04Array {
    /*
    * 数组的初始方式
    * 1.动态初始化（指定长度）
    * 2.静态初始化（指定内容）*/
    public static void main(String[] args) {
//        动态
        int [] arrayA = new int[300];
        String [] arrayC = new String[3];
//        可以拆分两步
        int [] ArrayE;
        ArrayE=new int[5];
//        静态
        int [] ArrayB = new int[]{1,2,3,4,5};
        String[] ArrayD = new String[]{"hello","java","world"};
//        可以拆分两步
        int[] ArrayF;
        ArrayF=new int[]{1,2,3,4,5};
//    静态的省略模式   不可以拆分
        int [] ArrayA ={1,2,3,4,5};
        String [] Array={"hello","java","world"};
    }
}
