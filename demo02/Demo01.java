package edition.demo02;

public class Demo01 {
    public static void printMethon(){
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        printMethon();
    }
}
