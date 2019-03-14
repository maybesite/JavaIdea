package edition.demo03;

public class Person {
/*private作用  保护数据不被更改
1.被private保护的数据 只能在本类中被访问
超出本类范围 就 无法访问
间接访问private成员变量，就是定义一对setAge  getAge*/
    String name;
    private int age;
    public void show(){
        System.out.println("我叫"+name+"年龄");
    }
    //这个成员方法 就是设置age的
    public void  setAge(int num){
        age=num;
    }
    //这个成员方法 就是访问age的
    public int getAge(){
        return age;
    }
    /*当方法的局部变量和类的成员变量重名的时候，根据 就近原则 优先使用局部变量
    * 如果需要访问本类当中的成员变量，需要使用格式
    * this.成员变量
    * “通过谁调用的方法 谁就是this
    * 参数name对方的名字
    * 成员变量name自己的名字*/

    public void callname(String name){
        System.out.println(name+"hello"+this.name);
        System.out.println(this);
    }
}
