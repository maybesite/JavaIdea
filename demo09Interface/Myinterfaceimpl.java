package edition.demo09Interface;

public class Myinterfaceimpl implements MyinterfaceAbstract {


    @Override
    public void methodAbs() {
        System.out.println(111);
    }

    @Override
    public void methodBcd() {
        System.out.println(222);
    }

    @Override
    public void methodDef() {
        System.out.println(333);
    }

    @Override
    public void methodEfg() {
        System.out.println(444);
    }
/**/
    public static void main(String[] args) {
        Myinterfaceimpl impl =new Myinterfaceimpl();
        impl.methodAbs();
    }
}
