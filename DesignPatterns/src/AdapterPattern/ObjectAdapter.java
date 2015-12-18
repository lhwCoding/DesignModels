package AdapterPattern;

import Utils.Utils;

/**
 * Created by smile on 2015/12/14.
 * 对象的适配器模式:
 * 基本思路和类的适配器模式相同，只是将ClassAdapter类作修改，这次不继承Source类，
 * 而是持有Source类的实例，以达到解决兼容性的问题
 */
public class ObjectAdapter implements Targetable {

    private Source source;
    public ObjectAdapter(Source source){
        super();
        this.source=source;
    }
    @Override
    public void method1() {
        Utils.showStr("this is the ObjectAdapter method1!");
    }

    @Override
    public void method2() {
           source.method1();
    }
}
