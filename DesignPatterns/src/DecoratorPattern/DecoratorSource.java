package DecoratorPattern;

import Utils.Utils;

/**
 * Created by smile on 2015/12/14.
 * 被装饰的类
 */
public class DecoratorSource implements InterDecorator {
    @Override
    public void method() {
        Utils.showStr("the DecoratorSource method!");
    }
}
