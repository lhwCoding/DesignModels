package SingLetonPattern;

/**
 * Created by smile on 2015/12/12.
 * 以下是一个单例类使用的例子，以懒汉式为例，这里为了保证线程安全，
 * 使用了双重检查锁定的方式
 */
public class SingletonTest {
    String name=null;

    private  SingletonTest(){}

    private static volatile  SingletonTest instance=null;

    public  static SingletonTest getInstance(){
        if (instance==null){
            synchronized (SingletonTest.class){
                if (instance==null){
                    instance=new SingletonTest();
                }
            }
        }
        return  instance;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void toStr(){
        System.out.println("this name is "+name);
    }

}
