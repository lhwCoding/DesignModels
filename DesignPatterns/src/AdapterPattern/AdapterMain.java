package AdapterPattern;

/**
 * Created by smile on 2015/12/14.
 * 适配模式:
 * 将某个接口转换成客户端期望的另一个接口表示,目的是消除由于接口不匹配所造成的类的兼容性问题
 * 主要分三类:
 * 类  对象 接口的适配模式
 * 应用场景:
 *
 * 类的适配器模式:
 * 当希望将一个类转换成满足另一个新接口的类时,可以使用类的适配器模式,创建一个新类,继承原有的类,实现新的接口即可.
 *
 * 对象的适配器模式:
 * 当希望将一个对象转换成满足另一个新接口的对象时,可以创建一个ObjectAdapter类,持有原类的一个实例,在其类的方法中
 * 调用实例的方法就行
 *
 * 接口的适配器模式:
 * 当不希望实现一个接口中所有的方法时,可以创建一个抽象类InterfaceAdapter,实现所有方法,我们写别的类的时候,继承抽象类即可
 */
public class AdapterMain {
    public static  void main(String[] args) {
        /**类的适配模式
         * 有一个Source类,拥有一个方法,待适配,目标接口时Targetable,通过Adapter类,将Source的功能拓展到Targetable里
         * */
        Targetable targetable = new ClassAdapter();
        targetable.method1();//this is Source method1
        targetable.method2();//this is the ClassAdapter method2

        //对象的适配器模式
        Source source=new Source();
        Targetable targetable1=new ObjectAdapter(source);
        targetable1.method1();//this is the ObjectAdapter method1!
        targetable1.method2();//this is Source method1

        //接口适配器模式
        Sourceable sourceable1=new SourceSubOne();
        Sourceable sourceable2=new SourceSubTwo();

       sourceable1.intermethod1();//this is SourceSubOne
        sourceable2.intermethod2();//this is SourceSubTwo
    }
}
