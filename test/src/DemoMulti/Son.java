package DemoMulti;

/**
 * @author Chen
 * @create 2020-06-13 19:08
 */
public class Son extends Father{
    int num = 10;
    int age = 16;

    @Override
    public void method(){
        System.out.println("子类执行方法！");
    }
    @Override
    public void shownum(){
        System.out.println(num);
    }
}
