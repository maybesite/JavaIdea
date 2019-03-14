package edition.demo08;
/*如何使用抽象类和抽象方法：
* 1.不能直接创建new抽象类对象
* 2.必须用一个子类来继承抽象父类
* 3.子类必须覆盖重写抽象父类当中的所有抽象方法
* 覆盖重写(实现)：子类去掉抽象方法的abstract关键字然后补上方法体大括号
* 4.创建子类对象进行使用*/
public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public static void main(String[] args) {
        Cat one=new Cat();
        one.eat();
    }
}
