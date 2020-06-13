package DemoMulti;

/**
 * @author Chen
 * @create 2020-06-13 19:53
 */
public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
