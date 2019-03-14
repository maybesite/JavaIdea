package edition.demo02;

public class Demo06SameArray {
    public static void main(String[] args) {
        int [] ArrayA = new int[3];
        ArrayA[0]=0;
        ArrayA[1]=10;
        ArrayA[2]=20;
        System.out.println(ArrayA);
//        将数组A的地址赋值给B数组
        int [] ArrayB=ArrayA;
        for (int i = 0; i < 3; i++) {
            System.out.println(ArrayB[i]);
        }
        System.out.println(ArrayB);
    }
}
