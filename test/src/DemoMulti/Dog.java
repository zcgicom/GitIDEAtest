package DemoMulti;

/**
 * @author Chen
 * @create 2020-06-13 20:13
 */
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    public void watchHoush(){
        System.out.println("狗看家");
    }
}
