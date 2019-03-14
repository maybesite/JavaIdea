package edition.demo05;
/*题目：定义一个数组 存储3个Person对象
* 数组有一个缺点 一旦创建，程序运行期间长度不可以发生改变*/
public class Demo01Array {
    public static void main(String[] args) {
        Person[] array=new Person[3];
        Person one=new Person("hello",20);
        Person two=new Person("world",21);
        Person three=new Person("good",22);

        array[0]=one;
        array[1]=two;
        array[2]=three;
        Person person=array[1];
        System.out.println(person.getName());
        System.out.println(array[0].getName());
    }
}
