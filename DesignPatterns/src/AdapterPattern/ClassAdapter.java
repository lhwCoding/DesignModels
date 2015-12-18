package AdapterPattern;

import Utils.Utils;

/**
 * Created by smile on 2015/12/14.
 * 类的适配器模式核心类
 * 有一个Source类,拥有一个方法,待适配,目标接口时Targetable,
 * 通过Adapter类,将Source的功能拓展到Targetable里
 */
public class ClassAdapter extends Source implements Targetable {
    @Override
    public void method2() {
      Utils.showStr("this is the ClassAdapter method2");
    }
}
