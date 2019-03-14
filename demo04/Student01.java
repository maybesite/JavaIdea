package edition.demo04;

public class Student01 {
    public static void main(String[] args) {
        Studentdemo01 stu1=new Studentdemo01();
        stu1.setName("迪丽热巴");
        stu1.setAge(20);
        System.out.println(stu1.getName()+stu1.getAge());
        Studentdemo01 stu2=new Studentdemo01("哈哈",21);
        System.out.println(stu2.getName()+stu2.getAge());

    }
}
