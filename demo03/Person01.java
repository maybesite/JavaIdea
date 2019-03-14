package edition.demo03;

public class Person01 {
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.name);
     //private 错误 不可访问   System.out.println(person.age);
        person.setAge(18);
        System.out.println(person.getAge());
        System.out.println("======");
        person.name="王思聪";
        person.callname("王健林");
        System.out.println(person);
    }
}
