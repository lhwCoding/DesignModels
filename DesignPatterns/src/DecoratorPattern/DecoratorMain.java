package DecoratorPattern;

/**
 * Created by smile on 2015/12/14.
 * 装饰模式:
 * 就是给一个对象增加一些新的功能,而且是动态的,要求装饰对象和被装饰的对象实现同一个接口,
 * 装饰对象持有被装饰对象的实例
 *
 * 应用场景:
 * 需要扩展一个类的功能
 * 动态的为一个对象增加功能,而且还能动态的撤销(继承不能做到这一点,继承的功能是静态的,不能动态增删)
 *缺点: 产生过多相似的对象,不易排错
 */
public class DecoratorMain {
    public static  void main(String[] args){
        InterDecorator source=new DecoratorSource();
        Decorator decorator=new Decorator(source);
        decorator.method();//before decorator  the DecoratorSource method!  after decorator


    }
}
