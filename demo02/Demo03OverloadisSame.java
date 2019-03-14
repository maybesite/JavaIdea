package edition.demo02;

public class Demo03OverloadisSame {
    public static void main(String[] args) {
        byte a=20;
        byte b=20;
        System.out.println(isSame(a,b));

        System.out.println(isSame(1,2));
    }

    private static boolean isSame(int a, int b) {
        boolean same;
        if(a==b){
            same=true;
        }else {
            same=false;
        }
        return same;
    }

    public static boolean isSame(byte a,byte b){
        boolean same;
        if(a==b){
            same=true;
        }else {
            same=false;
        }
        return same;
    }
    public static boolean isSame(short a,short b){
        boolean same;
        if(a==b){
            same=true;
        }else {
            same=false;
        }
        return same;
    }
    public static boolean isSame(long a,long b){
        boolean same;
        if(a==b){
            same=true;
        }else {
            same=false;
        }
        return same;
    }

}
