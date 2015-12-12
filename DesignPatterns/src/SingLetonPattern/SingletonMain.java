package SingLetonPattern;

/**
 * Created by smile on 2015/12/12.
 */
public class SingletonMain {
    public  static  void main(String[] args){
        SingletonTest test1=SingletonTest.getInstance();
        test1.setName("this One");
        SingletonTest test2=SingletonTest.getInstance();
        test2.setName("this two");

        test1.toStr();
        test2.toStr();

        if (test1==test2){
            System.out.println("创建的是同一个实例");
        }else{
            System.out.println("创建的不是同一个实例");
        }
    }
}
