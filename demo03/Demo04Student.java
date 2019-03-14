package edition.demo03;

public class Demo04Student {
    //构造方法
    private String name;
    private int age;
//    public Demo04Student(){   没有构造函数将会赠送这样的一个构造函数
//
//    }
    public Demo04Student(){
        System.out.println("无参数构造方法执行了");
    }
    public Demo04Student(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("有参数构造函数执行了");
    }
    public String getmessage(){
        return name;
    }
    public int getage(){
        return age;
    }
}
