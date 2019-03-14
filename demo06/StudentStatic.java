package edition.demo06;

public class StudentStatic {
    public static void main(String[] args) {
        Student one=new Student("迪丽热巴",20);
        Student two=new Student("夫利纳扎",21);
        one.room=101;
        System.out.println(one.getName()+one.getAge()+one.room+"学号"+one.getId());
        System.out.println(two.getName()+two.getAge()+two.room+"学号"+two.getId());
    }
}
