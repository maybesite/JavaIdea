package edition.demo06;
/*如果一个成员变量使用了static关键字，就变成了类变量。多个对象共享同一份数据*/
public class Student {
    private String name;
    private int age;
    static int room;
    private int id;
    private static int counter;
    public Student(){
        this.id=counter++;
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
        this.id=counter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
