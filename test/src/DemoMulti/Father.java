package DemoMulti;

/**
 * @author Chen
 * @create 2020-06-13 16:17
 */
public class Father /*extends Object*/{//父类默认集成Object类
    int num = 20;

    public void shownum(){
        System.out.println(num);
    }
    public void method(){
        System.out.println("父类执行方法");
    }
    public void methodfu(){
        System.out.println("父类特有方法！");
    }
}
