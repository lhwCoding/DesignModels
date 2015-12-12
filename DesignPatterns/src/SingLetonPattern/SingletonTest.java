package SingLetonPattern;

/**
 * Created by smile on 2015/12/12.
 * 以下是一个单例类使用的例子，以懒汉式为例，这里为了保证线程安全，
 * 使用了双重检查锁定的方式
 *
 * 结论:
 * 通过单例模式的学习告诉我们：

 1、单例模式理解起来简单，但是具体实现起来还是有一定的难度。

 2、synchronized关键字锁定的是对象，在用的时候，一定要在恰当的地方使用（注意需要使用锁的对象和过程，
 可能有的时候并不是整个对象及整个过程都需要锁）。

 采用类的静态方法，实现单例模式的效果，也是可行的，此处二者有什么不同？

 首先，静态类不能实现接口。（从类的角度说是可以的，但是那样就破坏了静态了。因为接口中不允许有static修饰的方法，所以即使实现了也是非静态的）

 其次，单例可以被延迟初始化，静态类一般在第一次加载是初始化。之所以延迟加载，是因为有些类比较庞大，所以延迟加载有助于提升性能。

 再次，单例类可以被继承，他的方法可以被覆写。但是静态类内部方法都是static，无法被覆写。

 最后一点，单例类比较灵活，毕竟从实现上只是一个普通的Java类，只要满足单例的基本需求，你可以在里面随心所欲的实现一些其它功能，但是静态类不行。
 从上面这些概括中，基本可以看出二者的区别，但是，从另一方面讲，我们上面最后实现的那个单例模式，内部就是用一个静态类来实现的，
 所以，二者有很大的关联，只是我们考虑问题的层面不同罢了。两种思想的结合，才能造就出完美的解决方案，就像HashMap采用数组+链表来实现一样
 ，其实生活中很多事情都是这样，单用不同的方法来处理问题，总是有优点也有缺点，最完美的方法是，结合各个方法的优点，才能最好的解决问题
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
