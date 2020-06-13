package DemoMulti;

/**
 * @author Chen
 * @create 2020-06-13 16:14
 * 多态 -- 代码中体现，父类引用指向子类对象
 * 格式：父类名称 对象名 = new 子类名称();
 * 或者：接口名称 对象名 = new 实现类名称();
 * 使用多态时，成员方法可以覆盖重写(Override)
 *
 * 1.对象的向上转型，其实就是多态写法：
 * 格式：父类名称 对象名 = new 子类名称();             Animal animal = new Cat();
 * 含义：右侧创建一个子类对象，把它当做父类来看待使用。  “创建了一只猫当做动物看待！” --> 即猫类型向上转型为动物类型
 * 注意事项：向上转型一定是安全的！     类似于double num = 100;//正确，int --> double,自动类型转换【转型后的范围更广，小范围转向大范围】
 * 缺点：对象一旦向上转型为父类，则无法再调用子类原本特有的方法和内容。【解决方案：对象的向下转型(还原)】
 * 2.对象的向下转型，
 * 格式：子类名称 对象名 = (子类名称) 父类对象;
 * 含义：将父类对象，[还原]为本来的子类对象。   Animal animal = new Cat();//本来是猫，向上转型为动物
 *                                          Cat cat = (Cat)animal;//本来是猫，已被转型为动物，向下转型[还原]为本来的猫类
 * 注意事项：a.必须保证对象本来创建的时候就是“猫”，才能向下转型成为猫！
 *          b.如果对象创建的时候本来不是猫，则向下转型[还原]成为“猫”时，会报错！
 *
 *使用多态时，成员变量不能覆盖重写；
 * 访问成员变量的两种方式：
 * 1.直接通过对象名称访问:看等号左边是谁，优先用谁，没有则向上查找。获得的成员变量就是那个类；一般获得的是父类变量
 * 2.使用成员方法间接访问:看该方法属于谁，优先用谁，没有则向上查找。
 */
public class MultiDemo {
    public static void main(String[] args) {
        //使用多态写法
        Father obj = new Son();//new的是哪个类，执行哪个方法
        obj.method();
        obj.methodfu();//父类特有的成员方法
        System.out.println(obj.num);
//        System.out.println(obj.age);//错误写法，父类没有该变量
        System.out.println("==========");
        obj.shownum();//子类未覆盖重写，则为父类，num=20;子类覆盖重写，则为子类,num=10;

        Father obj01 = new Son01();
        obj01.method();


        //对象的向上转型，就是：父类引用指向子类对象[即为多态写法]
        Animal animal = new Cat();//本来创建为一直猫，进行向上转型
        animal.eat();
        ///对象向下转型，进行“还原”动作
        Cat cat = (Cat)animal;
        cat.catchMouse();
        //错误的向下转型,本来是一直猫，非要转换为狗
        Dog dog = (Dog)animal;//错误写法!,编译不会报错，但运行会出现异常：java.lang.ClassCastException,类转换异常
    }
}
