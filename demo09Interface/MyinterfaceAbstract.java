package edition.demo09Interface;
/*任何版本java 接口都能定义抽象方法
* public abstract 返回类型 方法名称(参数列表)
* 注意事项：
* 1.接口当中的抽象方法，修饰符必须是两个固定的关键字:public abstract
* */
public interface MyinterfaceAbstract {
    //抽象方法
    public abstract void methodAbs();
    //抽象方法
    abstract void methodBcd();
    //抽象方法
    public void methodDef();
    //抽象方法
    void methodEfg();
/*接口使用步骤：
* 1.接口不能直接使用，必须有一个"实现类"来实现接口
* public class 实现类名称 implements 接口名称 {
*   }
* 2.接口的实现必须覆盖重写(实现)接口中所有的抽象方法。
* 实现：去掉abstract关键字 加上方法体大括号。
* 3.创建实现类的对象，进行使用。
* 注意事项：
* 如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类自己必须
* 是抽象类*/
}
