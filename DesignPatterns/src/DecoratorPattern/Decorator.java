package DecoratorPattern;

import Utils.Utils;

/**
 * Created by smile on 2015/12/14.
 * 装饰类
 */
public class Decorator implements InterDecorator {
    private InterDecorator source;

    public Decorator(InterDecorator source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {
        Utils.showStr("before decorator");
        source.method();
        Utils.showStr("after decorator");
    }
}
