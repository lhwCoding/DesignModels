package SingLetonPattern;

import java.util.Vector;

/**
 * Created by smile on 2015/12/10.
 * 实际情况是，单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，
 * 这个类的加载过程是线程互斥的。这样当我们第一次调用getInstance的时候，JVM能够帮我们保证instance只被创建一次，
 * 并且会保证把赋值给instance的内存初始化完毕，
 * 这样我们就不用担心上面的问题。同时该方法也只会在第一次调用的时候使用互斥机制，
 * 这样就解决了低性能问题。这样我们暂时总结一个完美的单例模式：
 * <p/>
 * 缺点:
 * 如果在构造函数中抛出异常 实例将永远的不到创建 也会出错
 */
public class SingletonIn {

    /* 私有构造方法，防止被实例化 */
    private SingletonIn() {
    }

    /* 此处使用一个内部类来维护单例 */
    private static class SingletonFactory {
        private static SingletonIn instance = new SingletonIn();
    }

    /* 获取实例 */
    public static SingletonIn getInstance() {
        return SingletonFactory.instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }
    /**
     * 另一种实现方式:
     *因为我们只需要在创建类的时候进行同步，所以只要将创建和getInstance()分开，单独为创建加synchronized关键字，也是可以的：
     * */
    /**
     * private  static  SingletonIn  singletonIn=null;
     * //加载一个空参构造
     * private  static synchronized  void  syncInit(){
     * if (singletonIn==null){
     * singletonIn=new SingletonIn();
     * }
     * }
     * public static  SingletonIn getSingletonIn(){
     * if (singletonIn==null){
     * syncInit();
     * }
     * return  singletonIn;
     * }
     */
    //对上实现方式采用 "影子实例"的办法为单列对象的属性实现同步更新
    private static SingletonIn singletonIn = null;
    private Vector properties=null;
    public  Vector getProperties(){
        return properties;
    }
    //加载一个空参构造
    private static synchronized void syncInit() {
        if (singletonIn == null) {
            singletonIn = new SingletonIn();
        }
    }

    public static SingletonIn getSingletonIn() {
        if (singletonIn == null) {
            syncInit();
        }
        return singletonIn;
    }

    public void  updateProperties(){
        SingletonIn shadow=new SingletonIn();
        properties=shadow.getProperties();
    }

}
