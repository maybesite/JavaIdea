package edition.demo04;
/*定义一个标准类
* 1.所有成员变量都要使用private关键字
* 2.为每一个成员变量编写一对Getter/Setter方法
* 3.编写一个无参数的构造方法
* 4.编写一个全参数的构造方法*/
public class Studentdemo01 {
    private String name;
    private int age;

    public Studentdemo01() {
    }

    public Studentdemo01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
