package edition.demo03;
/*构造方法是用来专门创建对象的方法
* 当我们通过new关键字来创建对象时，其实就是在调用构造方法
* 格式：
* public 类名称(参数类型 参数名称){
*     方法体
* }
* 注意事项
* 1.构造方法的名称必须和所在类名称完全一样 大小写也要一样
* 2.构造方法不要写返回类型 连void都不写
* 3.构造方法不能return一个具体的返回值
* 4.如果没有编写任何构造方法，那么编译器将会赠送一个构造方法，没有参数
* 方法体什么事情也不做
* 5.一旦编写了一个构造方法，那么编译器将不再赠送*/

public class Demo04Student01 {
    public static void main(String[] args) {
        Demo04Student stu01=new Demo04Student();
        Demo04Student student=new Demo04Student("hello",18);
        System.out.println(student.getmessage()+"哈哈"+student.getage());
    }
}
